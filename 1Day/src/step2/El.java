package step2;

import java.util.Scanner;

public class El {

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
		
		if (c.equals("+")) {
			System.out.println(a + b);
		} else if (c.equals("-")) {
			System.out.println(a - b);
		} else if (c.equals("*")) {
			System.out.println(a * b);
		} else if (c.equals("/")) {
			System.out.println((float) a / b); // ���� �� ��ȯ
		}
	}

}
