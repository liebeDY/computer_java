package step2;

class Test {
	
	private int i = 1;
	private static int j = 0;
	
	public static void test() {
		// static �� �ڽ��� Ŭ���� ���̶� ��ü �����ؾ� �Ѵ�
		// System.out.println(i); -> static �޼��� �����̹Ƿ� �ν��Ͻ� ���� i�� ���� �Ұ�
		// --> ��ü ���� �ʿ�
		// static �� ��ü ������� ��� ó���� �޸𸮿� ����
		System.out.println(j);
	}
	
	public void test2() {
		// �ν��Ͻ� �޼ҵ尡 �ǻ���Ű�� ���������� �ݵ�� ��ü�� ����
		System.out.println(i);
	}
}

public class TestStatic2 {

	public static void main(String[] args) {

		Test.test();
		
		Test t = new Test();
		t.test2();
		
	}

}
