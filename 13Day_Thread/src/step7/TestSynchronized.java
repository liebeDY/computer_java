package step7;

class Theater implements Runnable {

	private boolean seat = false;
	
	@Override
	public void run() {
		
	}
	
	// ����ȭ - ���� ������ �������� ���� 
	public synchronized void reserve() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " ������ ���� ó�� ����..");
		
		if (seat == false) {
			System.out.println(name + " ������ ���� ����");
		} 
	}
}

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
