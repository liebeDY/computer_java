package step1;

public class For12 {

	public static void main(String[] args) {
		
		int i, j;
		int sum = 0;
		
		for (i = 1; i <= 4; i++) {
			
			for (j = 1; j <= i; j++) {
				
				sum = sum + 1;
				System.out.print(sum);
			}
			System.out.println();
		}
		
		
	}

}
