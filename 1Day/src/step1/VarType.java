package step1;

public class VarType {

	public static void main(String[] args) {
		
		// �� Ÿ��
		boolean a = true;
		
		// ���� Ÿ��
		byte b = 10;
		short c = 20;
		int d = 30;
		long e = 40;
	
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		
		// �Ǽ���
		float f = 12.5f; // 4byte, float ���� f�� �ٿ��� �Ѵ�.
		double g = 34.56; // 8byte
		
		char h = 'k'; // 2byte, ���ڿ� ' ' �� �� �ִ�, �� �Ⱦ��δ�. �ƽ�Ű�ڵ�, ��ǻ�ʹ� ���ڷ� �ν�, ������
		
		// int < float
		
		String i = "hello java"; // String�� class, �ڷ���ó�� ����. ���ڿ�
		
		System.out.print(f);
		System.out.print(g);
		System.out.print(h);
		System.out.print(i);
	}

}
