package step7;

class Theater implements Runnable {

	private boolean seat = false;
	
	@Override
	public void run() {
		
	}
	
	// 동기화 - 단일 스레드 형식으로 실행 
	public synchronized void reserve() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " 스레드 예매 처리 시작..");
		
		if (seat == false) {
			System.out.println(name + " 스레드 예매 성공");
		} 
	}
}

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
