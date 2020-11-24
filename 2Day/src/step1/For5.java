package step1;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		i = sc.nextInt();
		
		System.out.println(i + "단");
		for (int a = 1; a <= 9; a++) {
			System.out.println(i + "x" + a + " = " + (a * i));
		}
		
	}

}
