package test.thread.concurrency.synchronizedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Not working with synchronizedList.
 * CopyOnWriteArrayList is fine, but has the overhead of creating new instance on modification
 * Query: https://stackoverflow.com/questions/56304742/understanding-synchronizedlist-in-java
 * @author Renju
 *
 */
public class Solution {
	 private List<String> list = Collections.synchronizedList(new ArrayList<String>());
	//private List<String> list = new ArrayList<>();
	// private CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	//BlockingQueue<String> list = new LinkedBlockingDeque<>();
	//private Deque<String> list = new ConcurrentLinkedDeque<>();

	public Solution() {
		for (int i = 0; i < 30; i++) {
			list.add("Item_" + i);
		}
	}

	private void removeItemsFromList() {
		synchronized (list) {
			System.out.println("Removing: " + list.remove(0));
		}
		
		/*String item = list.removeFirst();
        System.out.println("REMOVE " + item);*/
	}

	private void readFromLIst() {

		//synchronized (list) {
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				System.out.println("READ: "+ it.next());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		//}

	}

	public static void main(String[] args) throws InterruptedException {
		final Solution issue = new Solution();

		Thread t1 = new Thread(() -> {
			issue.readFromLIst();
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 30; i++) {
				issue.removeItemsFromList();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		t2.start();
		t1.start();
		

		t1.join();
		t2.join();

		System.out.println("Final List: " + issue.list);

	}

}
