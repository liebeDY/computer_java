package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public void go() throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(5432); // ��ü���� ū Ʋ���� ���� socket
		System.out.println("���� ������");
		
		try {
			while(true) {
				
				Socket socket = serverSocket.accept(); // �������� ����ڵ��� �޾��ִ� socket
				
				InputStream is = socket.getInputStream(); // ���������� byte�� �а� ȭ�鿡�� ���ڷ� ���
				InputStreamReader ir = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(ir);
				
				try {
					System.out.println(socket.getInetAddress() + " ���� �� : " + br.readLine());
				} catch (IOException ie) {
					System.out.println(socket.getInetAddress() + " �� �����͸� �д� ������ �߻�");
				}
				// �ݾ���� �Ѵ�
				br.close();
				socket.close();
			} // while ��
		} finally {
			if (serverSocket != null) { // ���� ������ ���� �ȵǸ� null -> �۾��� �� ������
				serverSocket.close(); // �ݾ��ش�
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
