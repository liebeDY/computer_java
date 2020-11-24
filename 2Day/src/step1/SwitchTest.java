package step1;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
 
		String grade = " ";

		Scanner sc = new Scanner(System.in);

		System.out.println("학년을 입력하세요 : ");

		grade = sc.next();

		switch (grade) {

		case "1학년":
			System.out.println("1학년");
			break;

		case "2학년":
			System.out.println("2학년");
			break;

		case "3학년":
			System.out.println("3학년");
			break;

		case "4학년":
			System.out.println("4학년");
			break;

		default:
			System.out.println("없다");

		}

	}

}
