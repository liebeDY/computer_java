package step2;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.println(num + "�� Ȧ�� �Դϴ�.");
		} else {
			System.out.println(num + "�� ¦�� �Դϴ�.");
		}
	}

}
