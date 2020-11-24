package step1;

public class Op2 {

	public static void main(String[] args) {
		int b = 2;
		System.out.println(++b); // 증감연산자, 값은 3, b에 1이 증가한 값 
		
		int i = 5; int j;
		j = i++; // 증감 연산자, i의 값 5를 넣고나서 증가, 증가된 값 6은 그다음 j에서 대입
		
		System.out.println("j = "+j); // 값은 5, ++이 뒤에 붙어서
		
		j = ++i; // j는 6이 들어가고 바로 1 증가 => 7
		
		System.out.println("j = "+j); // 값은 7, 
		
		j = i--; // j에는 7이 들어간 후에 1 감소, 감소된 값 6은 그다음 j에 대입
		
		System.out.println("j = "+j); // 값은 7, 
		
		j = --i; // j에는 6이 들어가고 바로 1 감소
		
		System.out.println("j = "+j);
	}

}
