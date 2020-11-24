package step1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int i, menu, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("조건이 항상 false 인 do_while");
		
		do {
			System.out.println("처음은 무조건 실행");
		} while (false); 
		
		System.out.println("더하기 do_while");
		
		do {
			System.out.println("더할 숫자를 입력하세요 : ");
			i = sc.nextInt();
			sum += i;
			System.out.println("더 할거야? 멈추려면 0");
			menu = sc.nextInt();
		} while (menu != 0);
		
		System.out.println("sum = " + sum);
		
	}

}
