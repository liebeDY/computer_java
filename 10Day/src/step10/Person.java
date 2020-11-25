package step10;

public class Person {

	private String day;
	
	public Person(String day) throws NameException {
		// ������ ��ȯ
		super();
		// ������ ���� ���������� ��ȯ
		int i = Integer.parseInt(day);
		
		if (i < 1 || i > 31) {
			throw new NameException("��¥�� 1�Ϻ��� 31�ϱ����� �����մϴ�");
		} else {
			this.day =day;
		}
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}
