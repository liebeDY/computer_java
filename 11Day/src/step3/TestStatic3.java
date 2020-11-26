package step3;

class Car {
	
	static int scount;
	int count;
	
	Car() {
		System.out.println("car »ý¼º");
		count++;
		scount++;
	}
}

public class TestStatic3 {

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.count);
		
		Car c2 = new Car();
		System.out.println(c2.count);
		
		Car c3 = new Car();
		System.out.println(c3.count);
		
		System.out.println(Car.scount++);
	}

}
