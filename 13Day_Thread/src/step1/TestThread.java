package step1;

class Worker extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("work run()..." + i);
		}
	}
}

class Test {
	public void test() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Test test()...." + i);
		}
	}
}

public class TestThread {

	public static void main(String[] args) {

		Test t = new Test();
		t.test();
		
		Worker w = new Worker();
		w.start();
		System.out.println("main thread Á¾·á");
	}
}
