package step2;

import java.util.Scanner;

public class uebung {

	public static void main(String[] args) {
		
		// ������
//		int i, j;
//		
//		for (i = 1; i <= 9; i++) {
//			System.out.println(i + "��");
//			for (j = 1; j <= 9; j++) {
//				if (i * j < 10) {
//					System.out.println(i + " x " + j + " =  " +i * j);
//				} else {
//				System.out.println(i + " x " + j + " = " + i * j);
//				}
//			}
//			System.out.println();
			
			
			// 1~100���� �� ���
//			int sum = 0;
//			
//			for (int i = 2; i <= 10; i = i+2) {
//				System.out.println(i);
//				sum += i;
//			}
//			System.out.println(sum);
//		}
		
			// �Է��ϴ� �� ��� ���ϱ�
			int a; 
			int sum = 0;
			int count = 0;
			Scanner sc = new Scanner(System.in);
			boolean b = true;
			while (b) {
				
				
			a = sc.nextInt();
			
			count = count + 1;
			System.out.println("�Է��� Ƚ���� " + count + "�Դϴ�.");
			sum += a;
			System.out.println("�Է��� ������ ���� " + sum + " �Դϴ�.");
			
			System.out.println("�Է��� ������ ����� " +  ((double) sum/count) + "�Դϴ�.");
			
			if (a == 0) {
				count = count - 1;
				b = false;
				break;
			}
				
		}
	
		
	}

}
