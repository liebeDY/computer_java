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
	ObjectInputStream ois; // object : �ڹٿ��� ���� ū ��ü -> deutet � �ڷ�� �� �ްڴ�
	
	OutputStream os;
	ObjectOutputStream oos;
	
	String receiveData;
	
	// ������
	public EchoServerEx(int port) {
		
		try {
			server = new ServerSocket(port);
			System.out.println("---- ���� ���� -----");
			System.out.println("������ Ŭ���̾�Ʈ ������ ���� ��û�� ��ٸ��� ����");
			
			child = server.accept(); // �����ڸ� �޾Ƶ��δ�
			System.out.println(child.getInetAddress() + " �κ��� ���� ��û ����");
			
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
			e.printStackTrace(); // ���� �޽��� ���
			System.exit(0);      // ���α׷� ����
		}
	}
	
	public static void main(String[] args) {

		new EchoServerEx(5000);
	}

}
