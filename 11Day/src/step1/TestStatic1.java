package step1;

class Company {
	
	public static int i = 1;
	public static void test() {
		System.out.println("static test");
	}
}

public class TestStatic1 {

	public static void main(String[] args) {

		// ���� ��ü ���� ���
		// Company c = new Company();
		
		// static ���� : Ŭ���� �̸����� �ٷ� ���
		Company.test();
		
		System.out.println(Company.i);
	}

}
