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
	
	// 생성자
	public EchoClientEx(String ip, int p) {
		
		ipAddress = ip;
		port = p;
		
		try {
			System.out.println("----- 클라이언트 ------");
			client = new Socket(ipAddress, port);
			read = new BufferedReader(new InputStreamReader(System.in));
			os = client.getOutputStream();
			oos = new ObjectOutputStream(os);
			
			System.out.println("입력 -> ");
			
			while ((sendData = read.readLine()) != null) {
				
				oos.writeObject(sendData);
				oos.flush();
				
				if (sendData.equals("quit")) {
					break;
				}
				receiveData = (String) ois.readObject();
				
				System.out.println(client.getInetAddress() + " 로부터 받은 메시지(에코 됨)" + receiveData);
				System.out.println("입력 ->");
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
