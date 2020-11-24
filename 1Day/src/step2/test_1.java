package step2;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		// 내가 쓴거 
		Scanner sc = new Scanner(System.in);
		
		int d;
		d = sc.nextInt();
		
		if (d < 0) {
			System.out.println("음수 입니다.");
		} else if ( d > 0) {
			System.out.println("양수 입니다.");
		}
		
		// 문제에 짝수도 있었음
		if (d % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		
		// 답
		int i;
		i = sc.nextInt();
		
		if(i < 0) {
			System.out.println("음수 입니다.");
		} else if(i > 0) {
			System.out.println("양수 입니다.");
		} else {
			System.out.println("0 입니다. ");
		}
	}

}
