package step4;

class ServerWorker extends Thread {
	
	private int time;
	
	ServerWorker(String name, int time) {
		super(name);
		this.time = time;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + " 서버 스레드 서비스.." + i);
		}
	}
}

public class TestThread4 {

	public static void main(String[] args) {

		ServerWorker worker1 = new ServerWorker("소지섭", 1000);
		worker1.start();
		
		ServerWorker worker2 = new ServerWorker("크리스탈", 3000);
		worker2.start();
		System.out.println("main 종료");
	}
}
