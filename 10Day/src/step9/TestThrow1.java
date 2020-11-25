package step9;

class MyException extends Exception {
	
	public MyException(String message) {
		super(message);
	}
}


class Service {
	// Exception �߻��Ǹ� ȣ���� ������ ������ : throws
	public void test(int age) throws MyException {
		if (age <= 0) {
			throw new MyException("���̴� 1�� �̻��̾�� �մϴ�.");
		}
		System.out.println(age + " ��");
	}
}

public class TestThrow1 {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		try {
			service.test(0);
//			service.test(13);
		} catch (MyException e) {
			// MyException �� Exception �� ��ӹ޾ұ⿡ getMessage()��� ����
			System.out.println(e.getMessage());
			// throw new MyException(""); --> super(Message)
		}
	}

}
