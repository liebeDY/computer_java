package step1;

public class Op3 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.println(a == b); // a와 b의 값이 같은지 물어보는 것 -> false
		System.out.println(a != b); // a와 b의 값이 다른지 물어보는 것 -> true
		
		System.out.println(a > b); // a가 b보다 크다 -> false
		System.out.println(a >= b); // a가 b보다 크거나 같다 -> false
		System.out.println(a < b); // a가 b보다 작다 -> true
		System.out.println(a <= b); // a가 b보다 작거나 같다 -> true
	}

}
