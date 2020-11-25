package step10;

public class Person {

	private String day;
	
	public Person(String day) throws NameException {
		// 정수형 변환
		super();
		// 연산을 위해 정수형으로 변환
		int i = Integer.parseInt(day);
		
		if (i < 1 || i > 31) {
			throw new NameException("날짜는 1일부터 31일까지만 가능합니다");
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
