package step10;

public class TestThrow2 {

	public static void main(String[] args) {

		try {
			Person date = new Person("32");
			System.out.println(date.getDay());
		} catch(NameException e) {
			System.out.println(e.getMessage());
		}
	}

}
