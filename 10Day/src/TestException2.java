
public class TestException2 {

	public static void main(String[] args) {

		String s = null;
		
		try { // Exception �� �߻��� ������ ����Ǵ� �ڵ� ��
			System.out.println(s.length());
			// �� �ڵ忡�� Exception �߻��ϸ� �ٷ� catch ��������
			// Exception �߻� �ȵǸ� �Ʒ� ���� ����
			System.out.println("???????");
			
			
			// jvm �� ���� Exception �� �޾Ƽ� ������ �������
			// Exception �� ó��
		} catch (NullPointerException ne) { // Exception �̶�� �ᵵ �ȴ�
			System.out.println("null�̹Ƿ� ���̸� ���� �� ����");
		}
		
		System.out.println("���α׷� ���� ����");
	}

}
