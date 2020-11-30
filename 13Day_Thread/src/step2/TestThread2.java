package step2;

class Worker extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("worker run().." + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestThread2 {

	public static void main(String[] args) {
		
		Worker w = new Worker();
		w.start();
		System.out.println("main Á¾·á");
	}
}
