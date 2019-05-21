package test.thread.singleton;

public class ThreadStarter {

	public static void main(String[] args) {

		Thread[] tAry = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(() -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ConsoleService.getInstance().printData("Data for Thread "+Thread.currentThread().getName());
			}, "Thread "+i);
			tAry[i] = t;
		}

		for (Thread t : tAry) {
			t.start();
		}

	}

}
