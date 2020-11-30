package step3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;


public class EchoClientEx {

	String ipAddress;
	int port;
	Socket client = null;
	
	BufferedReader read;
	InputStream is;
	ObjectInputStream ois;
	
	OutputStream os;
	ObjectOutputStream oos;
	
	String sendData;
	String receiveData;
	
	// ������
	public EchoClientEx(String ip, int p) {
		
		ipAddress = ip;
		port = p;
		
		try {
			System.out.println("----- Ŭ���̾�Ʈ ------");
			client = new Socket(ipAddress, port);
			read = new BufferedReader(new InputStreamReader(System.in));
			os = client.getOutputStream();
			oos = new ObjectOutputStream(os);
			
			System.out.println("�Է� -> ");
			
			while ((sendData = read.readLine()) != null) {
				
				oos.writeObject(sendData);
				oos.flush();
				
				if (sendData.equals("quit")) {
					break;
				}
				receiveData = (String) ois.readObject();
				
				System.out.println(client.getInetAddress() + " �κ��� ���� �޽���(���� ��)" + receiveData);
				System.out.println("�Է� ->");
			}
			ois.close();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {

		new EchoClientEx("localhost", 5000);
	}

}
