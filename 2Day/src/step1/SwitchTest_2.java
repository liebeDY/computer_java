package step1;

import java.util.Scanner;

public class SwitchTest_2 {

	public static void main(String[] args) {
		
		int a, b;
		String c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		
		a = sc.nextInt(); // ���� �Է� �޾Ƽ� a�� �ִ´�
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		
		b = sc.nextInt();
		
		System.out.println("�����ڸ� �Է��ϼ��� : ");
		c = sc.next(); // ���ڿ��϶��� next()
		
		switch (c) {
		
		case "+" :
			System.out.println(a + b);
			break;
		case "-" :
			System.out.println(a - b);
			break;
		case "*" :
			System.out.println(a * b);
			break;
		case "/" :
			System.out.println((float) a / b);
			break;
		}
	}

}
