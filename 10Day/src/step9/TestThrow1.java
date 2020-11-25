package step9;

class MyException extends Exception {
	
	public MyException(String message) {
		super(message);
	}
}


class Service {
	// Exception 발생되면 호출한 곳으로 던진다 : throws
	public void test(int age) throws MyException {
		if (age <= 0) {
			throw new MyException("나이는 1세 이상이어야 합니다.");
		}
		System.out.println(age + " 세");
	}
}

public class TestThrow1 {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		try {
			service.test(0);
//			service.test(13);
		} catch (MyException e) {
			// MyException 은 Exception 을 상속받았기에 getMessage()사용 가능
			System.out.println(e.getMessage());
			// throw new MyException(""); --> super(Message)
		}
	}

}
