package step1;

public class Op1 {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c = 0; // = int c; 라고 써도 된다, 초기화 값 : 0
		String s = null; // = String s; 초기화 값 : null
		
		
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		c = a / b;
		System.out.println(c);
		
		c = 12 % 5;
		System.out.println(c);
	}

}
