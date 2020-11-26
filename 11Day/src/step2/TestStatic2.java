package step2;

class Test {
	
	private int i = 1;
	private static int j = 0;
	
	public static void test() {
		// static 은 자신의 클래스 안이라도 객체 생성해야 한다
		// System.out.println(i); -> static 메서드 내부이므로 인스턴스 변수 i에 접근 불가
		// --> 객체 생성 필요
		// static 은 객체 관계없이 모두 처음에 메모리에 적재
		System.out.println(j);
	}
	
	public void test2() {
		// 인스턴스 메소드가 실생시키는 전제조건은 반든시 객체를 생성
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
