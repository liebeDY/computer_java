package step1;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
 
		String grade = " ";

		Scanner sc = new Scanner(System.in);

		System.out.println("�г��� �Է��ϼ��� : ");

		grade = sc.next();

		switch (grade) {

		case "1�г�":
			System.out.println("1�г�");
			break;

		case "2�г�":
			System.out.println("2�г�");
			break;

		case "3�г�":
			System.out.println("3�г�");
			break;

		case "4�г�":
			System.out.println("4�г�");
			break;

		default:
			System.out.println("����");

		}

	}

}
