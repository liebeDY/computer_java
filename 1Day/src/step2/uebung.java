package step2;

import java.util.Scanner;

public class uebung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 짝수 홀수 
		int a;
		System.out.println("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
		if (a % 2 == 1) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("짝수 입니다.");
		}
		
		// 음수 양수
		int b;
		System.out.println("숫자를 입력하세요 : ");
		b = sc.nextInt();
		
		if (b > 0) {
			System.out.println("양수 입니다.");
		} else if (b < 0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		/* 
		 계산기
		 1. 2개의 숫자르 받을 변수, 연산자를 받을 변수
		 2. 더하기, 빼기, 곱하기, 나누기의 조건 
		*/
		
		
		int c, d;
		String e;
		System.out.println("숫자를 입력하세요 : ");
		c = sc.nextInt();
		
		System.out.println("숫자를 입력하세요 : ");
		d = sc.nextInt();
		
		System.out.println("연산자를 입력하세요 : ");
		e = sc.next();
		
		if (e.equals("+")) {
			System.out.println(c + d);
		} else if (e.equals("-")) {
			System.out.println(c - d);
		} else if (e.equals("*")) {
			System.out.println(c * d);
		} else if (e.equals("/")) {
			System.out.println((float) c / d);
		}
		
		// 학점 계산기
		
		int f;
		System.out.println("점수를 입력하세요");
		f = sc.nextInt();
		
		
		if (f >= 90 && f <= 100) {
			System.out.println("A");
		} else if (f >= 80 && f <= 89) {
			System.out.println("B");
		} else if (f >=70 && f <=79) {
			System.out.println("C");
		} else if (f >=60 && f <=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
