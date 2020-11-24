package step1;

public class CastingTest {

	public static void main(String[] args) {
		// 자동 형 변환
		int a = 12, b = 13;
		float c = 0;
		c = (a+b)/2;
		System.out.println("a와 b의 평균값"+c+"이다."); // 자동형변환, 작은 타입(int)에서 큰 타입(float)으로 바뀜
		
		
		// 강제 형 변환
		float f = 12.5f;
		a = (int)f;
		System.out.println("a=" + a);
	}

}
