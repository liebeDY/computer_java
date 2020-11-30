package step7;

class Theater implements Runnable {

	private boolean seat = false;
	
	@Override
	public void run() {
		reserve();
	}
	
	// 동기화 - 단일 스레드 형식으로 실행 
	public synchronized void reserve() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " 스레드 예매 처리 시작..");
		
		if (seat == false) {
			System.out.println(name + " 스레드 예매 성공");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seat = true; // 예매 하였으므로 상태를 true로 변경
		} else {
			System.out.println("예매 실패");
		}
	}
}

public class TestSynchronized {

	public static void main(String[] args) {

		Theater th = new Theater();
		Thread t1 = new Thread(th, "소지섭");
		Thread t2 = new Thread(th, "크리스탈");
		
		t1.start();
		t2.start();
	}
}
