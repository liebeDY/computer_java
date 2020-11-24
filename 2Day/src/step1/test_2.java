package step1;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {

		int a, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		a = sc.nextInt();

		c = a / 10;

		switch (c) {

		case 10:
			System.out.println("A");
			break;

		case 9:
			System.out.println("A");
			break;

		case 8:
			System.out.println("B");
			break;

		case 7:
			System.out.println("C");
			break;

		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("F");
		}

	}

}
