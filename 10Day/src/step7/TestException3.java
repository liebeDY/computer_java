package step7;

public class TestException3 {

	public static void main(String[] args) {

		String names [] = { "ũ����Ż", "������", "Ȳ����" };
		
		try {
			System.out.println(names[1]);
			System.out.println(names[2]);
			
			String s = null;
			
			System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("�ε��� ���� �ʰ�");
			
			// Exception �޼����� �߻� ��� ���
		} catch (Exception e) {
			e.printStackTrace();
			
			// �׻� ����ȴ�.
		} finally {
			System.out.println("finally");
		}
		System.out.println("���� ����");
	}

}
