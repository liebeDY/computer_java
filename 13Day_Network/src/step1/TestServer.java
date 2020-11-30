package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public void go() throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(5432); // 전체적인 큰 틀에서 만든 socket
		System.out.println("서버 수행중");
		
		try {
			while(true) {
				
				Socket socket = serverSocket.accept(); // 개별적인 사용자들을 받아주는 socket
				
				InputStream is = socket.getInputStream(); // 내부적으로 byte로 읽고 화면에는 문자로 출력
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(ir);
				
				try {
					System.out.println(socket.getInetAddress() + " 님의 말 : " + br.readLine());
				} catch (IOException ie) {
					System.out.println(socket.getInetAddress() + " 의 데이터를 읽는 문제가 발생");
				}
				// 닫아줘야 한다
				br.close();
				socket.close();
			} // while 끝
		} finally {
			if (serverSocket != null) { // 서버 소켓이 생성 안되면 null -> 작업이 다 끝나면
				serverSocket.close(); // 닫아준다
			}
		}
	}

	public static void main(String[] args) {

		TestServer ts = new TestServer();
		
		try {
			ts.go();
		} catch (IOException e) {
			e.printStackTrace();
	
		}
	}
}
