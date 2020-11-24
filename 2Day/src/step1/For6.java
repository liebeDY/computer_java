package step1;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		i = sc.nextInt();
		
		for (int a = 1; a <= i; a++) {
			sum += a;
		}
		
		System.out.println(sum);
		
	}

}
