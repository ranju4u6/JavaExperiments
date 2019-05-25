package test.thread.concurrency.copyonwtitelist;

import java.util.ArrayList;

public class Issue {
	private ArrayList<String> list = new ArrayList<>();

	public Issue() {
		for (int i = 0; i < 10; i++) {

			list.add("Item_" + i);
		}
	}

	private void addItemsToList() {

		for (int i = 10; i < 20; i++) {
			System.out.println("Adding item : " + "Item_" + i);
			list.add("Item_" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void readFromLIst() {

		for (String s : list) {

			System.out.println(s);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		final Issue issue = new Issue();

		Thread t1 = new Thread(() -> {
			issue.readFromLIst();
		});

		Thread t2 = new Thread(() -> {
			issue.addItemsToList();
		});

		t2.start();
		t1.start();

	}

}
