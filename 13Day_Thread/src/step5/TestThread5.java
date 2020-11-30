package step5;

class Worker implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "worker run..." + i);
		}
	}
}

public class TestThread5 {

	public static void main(String[] args) {

		Worker w1 = new Worker();
		Thread t1 = new Thread(w1, "������");
		
		System.out.println("�켱 ���� : " + t1.getPriority()); // �⺻�� 5
		
		Thread t2 = new Thread(w1, "ũ����Ż");
		t2.setPriority(Thread.MAX_PRIORITY); // Max = 10
		
		t1.start();
		t2.start();
		System.out.println("main ����");
	}
}
