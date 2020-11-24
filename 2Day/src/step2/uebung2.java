package step2;

public class uebung2 {

	public static void main(String[] args) {
		int i, j, a, b;
		
		for (i = 1; i <= 10; i++) {
			for (j = 10; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (a = 1; a <= 10; a++) {
			for (b = 1; b <= a+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
