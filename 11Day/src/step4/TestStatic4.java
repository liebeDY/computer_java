package step4;

public class TestStatic4 {

	public static void main(String[] args) {
		
		System.out.println("main 실행");
	} static {
		// 프로그램 실행전 사전 작업이 필요할 때
		// 드라이버 설치 같은 것에 사용
		// main 보다 먼저 실행된다
		System.out.println("static 초기화 블럭");
	}

}
