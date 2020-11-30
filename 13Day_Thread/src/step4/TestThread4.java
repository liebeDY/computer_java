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

	}

}
