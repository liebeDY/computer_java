package step1;

class Company {
	
	public static int i = 1;
	public static void test() {
		System.out.println("static test");
	}
}

public class TestStatic1 {

	public static void main(String[] args) {

		// 기존 객체 생성 방법
		// Company c = new Company();
		
		// static 생성 : 클래스 이름으로 바로 사용
		Company.test();
		
		System.out.println(Company.i);
	}

}
