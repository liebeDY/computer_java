package step1;

public class Op2 {

	public static void main(String[] args) {
		int b = 2;
		System.out.println(++b); // ����������, ���� 3, b�� 1�� ������ �� 
		
		int i = 5; int j;
		j = i++; // ���� ������, i�� �� 5�� �ְ��� ����, ������ �� 6�� �״��� j���� ����
		
		System.out.println("j = "+j); // ���� 5, ++�� �ڿ� �پ
		
		j = ++i; // j�� 6�� ���� �ٷ� 1 ���� => 7
		
		System.out.println("j = "+j); // ���� 7, 
		
		j = i--; // j���� 7�� �� �Ŀ� 1 ����, ���ҵ� �� 6�� �״��� j�� ����
		
		System.out.println("j = "+j); // ���� 7, 
		
		j = --i; // j���� 6�� ���� �ٷ� 1 ����
		
		System.out.println("j = "+j);
	}

}
