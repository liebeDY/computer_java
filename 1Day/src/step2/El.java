package step2;

import java.util.Scanner;

public class El {

	public static void main(String[] args) {
		int a, b;
		String c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		
		a = sc.nextInt(); // 값을 입력 받아서 a에 넣는다
		
		System.out.println("숫자를 입력하세요 : ");
		
		b = sc.nextInt();
		
		System.out.println("연산자를 입력하세요 : ");
		c = sc.next(); // 문자열일때는 next()
		
		if (c.equals("+")) {
			System.out.println(a + b);
		} else if (c.equals("-")) {
			System.out.println(a - b);
		} else if (c.equals("*")) {
			System.out.println(a * b);
		} else if (c.equals("/")) {
			System.out.println((float) a / b); // 강제 형 변환
		}
	}

}
