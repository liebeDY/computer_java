package step1;

public class CastingTest {

	public static void main(String[] args) {
		// �ڵ� �� ��ȯ
		int a = 12, b = 13;
		float c = 0;
		c = (a+b)/2;
		System.out.println("a�� b�� ��հ�"+c+"�̴�."); // �ڵ�����ȯ, ���� Ÿ��(int)���� ū Ÿ��(float)���� �ٲ�
		
		
		// ���� �� ��ȯ
		float f = 12.5f;
		a = (int)f;
		System.out.println("a=" + a);
	}

}
