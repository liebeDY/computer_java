package step1;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 1; 
		int a;
		System.out.println("����� ���� ���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();
		
		while (i <= a) {
			
			if(a % i == 0) {
				System.out.println(i + "\t");
			}
			i++;
		}
	}
}
