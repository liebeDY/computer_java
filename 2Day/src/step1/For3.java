package step1;

public class For3 {

	public static void main(String[] args) {
		
		int i;
		
		for (i = 1; i <= 100; i++) {
			// È¦¼ö 
			if (i % 2 != 0) {
				System.out.println(i + "\t");
			}
			
			// 10ÀÇ ¹è¼ö
			if (i % 10 == 0) {
				System.out.println();
			}
			
			
		}
	}

}
