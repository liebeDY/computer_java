package step7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {

		String path = "C:\\java-kosta/data.dat";
		
		FileOutputStream fos = new FileOutputStream(path);
		
		DataOutputStream dout = new DataOutputStream(fos);
		
		dout.writeInt(1);
		dout.writeByte(2);
		dout.writeShort(3);
		dout.writeBoolean(true);
		dout.writeChar('c');
		dout.writeFloat(3.23f);
		dout.writeDouble(234.567);
		
		FileInputStream fis = new FileInputStream(path);
		DataInputStream din = new DataInputStream(fis);
		
		System.out.println("int: " + din.readInt()); 
		System.out.println("byte: " + din.readByte());
		System.out.println("short: " + din.readShort());
		System.out.println("boolean: " + din.readBoolean());
		System.out.println("char: " + din.readChar());
		System.out.println("float: " + din.readFloat());
		System.out.println("double: " + din.readDouble());
		
		din.close();
		dout.close();
	}
}
