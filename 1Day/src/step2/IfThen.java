package step2;

public class IfThen {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean flag = true;
		
		if(a == 10) {
			System.out.println("a가 10이면 참");
		}
		
		if(a == b) {
			System.out.println("a와 b가 같으면 참");
		}
		
		if(flag) {
			System.out.println("flag값이 true이면 참");
		}
		
	System.out.println("이 문장은 if문과 상관 없이 실행");	
	}

}
