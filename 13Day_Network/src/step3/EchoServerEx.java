package step3;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerEx {

	ServerSocket server;
	Socket child;
	
	InputStream is;
	ObjectInputStream ois; // object : 자바에서 제일 큰 객체 -> deutet 어떤 자료든 다 받겠다
	
	OutputStream os;
	ObjectOutputStream oos;
	
	String receiveData;
	
	// 생성자
	public EchoServerEx(int port) {
		
		try {
			server = new ServerSocket(port);
			System.out.println("---- 에코 서버 -----");
			System.out.println("서버는 클라이언트 소켓의 접속 요청을 기다리고 있음");
			
			child = server.accept(); // 접속자를 받아들인다
			System.out.println(child.getInetAddress() + " 로부터 연결 요청 받음");
			
			is = child.getInputStream();
			ois = new ObjectInputStream(is);
			
			os = child.getOutputStream();
			oos = new ObjectOutputStream(os);
			
			while ((receiveData = (String) ois.readObject()) != null) {
				
				if (receiveData.equals("quit")) {
					break;
				}
				oos.writeObject(receiveData);
				oos.flush();
			}
			is.close();
			ois.close();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace(); // 에러 메시지 출력
			System.exit(0);      // 프로그램 종료
		}
	}
	
	public static void main(String[] args) {

		new EchoServerEx(5000);
	}

}
