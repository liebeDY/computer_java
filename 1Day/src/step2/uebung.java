package step2;

import java.util.Scanner;

public class uebung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ¦�� Ȧ�� 
		int a;
		System.out.println("���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();
		
		if (a % 2 == 1) {
			System.out.println("Ȧ�� �Դϴ�.");
		} else {
			System.out.println("¦�� �Դϴ�.");
		}
		
		// ���� ���
		int b;
		System.out.println("���ڸ� �Է��ϼ��� : ");
		b = sc.nextInt();
		
		if (b > 0) {
			System.out.println("��� �Դϴ�.");
		} else if (b < 0) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
		
		/* 
		 ����
		 1. 2���� ���ڸ� ���� ����, �����ڸ� ���� ����
		 2. ���ϱ�, ����, ���ϱ�, �������� ���� 
		*/
		
		
		int c, d;
		String e;
		System.out.println("���ڸ� �Է��ϼ��� : ");
		c = sc.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		d = sc.nextInt();
		
		System.out.println("�����ڸ� �Է��ϼ��� : ");
		e = sc.next();
		
		if (e.equals("+")) {
			System.out.println(c + d);
		} else if (e.equals("-")) {
			System.out.println(c - d);
		} else if (e.equals("*")) {
			System.out.println(c * d);
		} else if (e.equals("/")) {
			System.out.println((float) c / d);
		}
		
		// ���� ����
		
		int f;
		System.out.println("������ �Է��ϼ���");
		f = sc.nextInt();
		
		
		if (f >= 90 && f <= 100) {
			System.out.println("A");
		} else if (f >= 80 && f <= 89) {
			System.out.println("B");
		} else if (f >=70 && f <=79) {
			System.out.println("C");
		} else if (f >=60 && f <=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
