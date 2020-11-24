package step2;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.println(num + "은 홀수 입니다.");
		} else {
			System.out.println(num + "은 짝수 입니다.");
		}
	}

}
