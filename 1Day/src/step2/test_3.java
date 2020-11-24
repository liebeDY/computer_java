package step2;

import java.util.Scanner;

public class test_3 {

	public static void main(String[] args) {
		// 숫자 2개를 입력 받아서 최대값, 최소값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, max, min;
		
		System.out.println("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
		System.out.println("숫자를 입력하세요 : ");
		b = sc.nextInt();
		
		if(a > b) {
			max = a;
			min = b;
		} 
		else {
			max = b;
			min = a;
		}
		
		System.out.println("최대값은 " + max + " 입니다.");
		System.out.println("최소값은 " + min + " 입니다.");
	}

}
