
public class TestException2 {

	public static void main(String[] args) {

		String s = null;
		
		try { // Exception 이 발생될 것으로 예상되는 코드 블럭
			System.out.println(s.length());
			// 위 코드에서 Exception 발생하면 바로 catch 구문으로
			// Exception 발생 안되면 아래 구문 실행
			System.out.println("???????");
			
			
			// jvm 야 던진 Exception 을 받아서 적절한 대안으로
			// Exception 을 처리
		} catch (NullPointerException ne) { // Exception 이라고 써도 된다
			System.out.println("null이므로 길이를 구할 수 없음");
		}
		
		System.out.println("프로그램 정상 수행");
	}

}
