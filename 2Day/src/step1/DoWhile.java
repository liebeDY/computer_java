package step1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int i, menu, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �׻� false �� do_while");
		
		do {
			System.out.println("ó���� ������ ����");
		} while (false); 
		
		System.out.println("���ϱ� do_while");
		
		do {
			System.out.println("���� ���ڸ� �Է��ϼ��� : ");
			i = sc.nextInt();
			sum += i;
			System.out.println("�� �Ұž�? ���߷��� 0");
			menu = sc.nextInt();
		} while (menu != 0);
		
		System.out.println("sum = " + sum);
		
	}

}
