package step1;

public class VarType {

	public static void main(String[] args) {
		
		// 논리 타입
		boolean a = true;
		
		// 정수 타입
		byte b = 10;
		short c = 20;
		int d = 30;
		long e = 40;
	
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		
		// 실수형
		float f = 12.5f; // 4byte, float 에는 f를 붙여야 한다.
		double g = 34.56; // 8byte
		
		char h = 'k'; // 2byte, 문자열 ' ' 이 들어가 있다, 잘 안쓰인다. 아스키코드, 컴퓨터는 숫자로 인식, 정수형
		
		// int < float
		
		String i = "hello java"; // String은 class, 자료형처럼 쓴다. 문자열
		
		System.out.print(f);
		System.out.print(g);
		System.out.print(h);
		System.out.print(i);
	}

}
