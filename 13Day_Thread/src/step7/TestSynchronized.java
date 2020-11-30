package step7;

class Theater implements Runnable {

	private boolean seat = false;
	
	@Override
	public void run() {
		reserve();
	}
	
	// ����ȭ - ���� ������ �������� ���� 
	public synchronized void reserve() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " ������ ���� ó�� ����..");
		
		if (seat == false) {
			System.out.println(name + " ������ ���� ����");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seat = true; // ���� �Ͽ����Ƿ� ���¸� true�� ����
		} else {
			System.out.println("���� ����");
		}
	}
}

public class TestSynchronized {

	public static void main(String[] args) {

		Theater th = new Theater();
		Thread t1 = new Thread(th, "������");
		Thread t2 = new Thread(th, "ũ����Ż");
		
		t1.start();
		t2.start();
	}
}
