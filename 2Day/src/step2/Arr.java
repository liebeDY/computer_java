package step2;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] inArr = new int[] {1, 2, 3, 4, 5};
		int i;
		
		for (i = 0; i < inArr.length; i++) {
			
			System.out.println(inArr[i] + "\t");
		}
		
		System.out.println("5���� ���� �Է� : ");
		for (i = 0; i < inArr.length; i++) {
			inArr[i] = sc.nextInt();
		}
		
		for (i = 0; i < inArr.length; i++) {
			
			System.out.println(inArr[i] + "\t");
		}
	}

}
