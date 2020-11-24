package step15;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGeneric {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("백박사", 200));
		list.add(new Person("황정민", 300));
		list.add(new Person("크리스탈", 400));
		
		System.out.println(list);
		
		Iterator<Person> it = list.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			total += it.next().getMoney(); // Generic 으로 미리 Person 형식 지정
										   // -> getMoney() 사용 가능
		}
		System.out.println(total);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
