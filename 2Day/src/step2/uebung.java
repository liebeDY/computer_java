package step2;

import java.util.Scanner;

public class uebung {

	public static void main(String[] args) {
		
		// 구구단
//		int i, j;
//		
//		for (i = 1; i <= 9; i++) {
//			System.out.println(i + "단");
//			for (j = 1; j <= 9; j++) {
//				if (i * j < 10) {
//					System.out.println(i + " x " + j + " =  " +i * j);
//				} else {
//				System.out.println(i + " x " + j + " = " + i * j);
//				}
//			}
//			System.out.println();
			
			
			// 1~100까지 합 출력
//			int sum = 0;
//			
//			for (int i = 2; i <= 10; i = i+2) {
//				System.out.println(i);
//				sum += i;
//			}
//			System.out.println(sum);
//		}
		
			// 입력하는 값 평균 구하기
			int a; 
			int sum = 0;
			int count = 0;
			Scanner sc = new Scanner(System.in);
			boolean b = true;
			while (b) {
				
				
			a = sc.nextInt();
			
			count = count + 1;
			System.out.println("입력한 횟수는 " + count + "입니다.");
			sum += a;
			System.out.println("입력한 값들의 합은 " + sum + " 입니다.");
			
			System.out.println("입력한 값들의 평균은 " +  ((double) sum/count) + "입니다.");
			
			if (a == 0) {
				count = count - 1;
				b = false;
				break;
			}
				
		}
	
		
	}

}
