package step2;

import java.util.Scanner;

public class test_3 {

	public static void main(String[] args) {
		// ���� 2���� �Է� �޾Ƽ� �ִ밪, �ּҰ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, max, min;
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		b = sc.nextInt();
		
		if(a > b) {
			max = a;
			min = b;
		} 
		else {
			max = b;
			min = a;
		}
		
		System.out.println("�ִ밪�� " + max + " �Դϴ�.");
		System.out.println("�ּҰ��� " + min + " �Դϴ�.");
	}

}
