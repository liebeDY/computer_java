package step2;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		// ���� ���� 
		Scanner sc = new Scanner(System.in);
		
		int d;
		d = sc.nextInt();
		
		if (d < 0) {
			System.out.println("���� �Դϴ�.");
		} else if ( d > 0) {
			System.out.println("��� �Դϴ�.");
		}
		
		// ������ ¦���� �־���
		if (d % 2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		}
		
		// ��
		int i;
		i = sc.nextInt();
		
		if(i < 0) {
			System.out.println("���� �Դϴ�.");
		} else if(i > 0) {
			System.out.println("��� �Դϴ�.");
		} else {
			System.out.println("0 �Դϴ�. ");
		}
	}

}
