package step3;

class Worker extends Thread {
	
	Worker(String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++ ) {
			System.out.println(getName() + " worker run..." + i);
		}
	}
}

public class TestThread3 {

	public static void main(String[] args) {
	
		Worker w1 = new Worker("¼ÒÁö¼·");
		w1.start();
		
		Worker w2 = new Worker("asdf");
		w2.start();
		
		System.out.println("main thread Á¾·á");
		
	}
}
