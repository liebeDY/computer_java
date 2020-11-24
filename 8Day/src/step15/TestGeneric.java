package step15;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGeneric {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("��ڻ�", 200));
		list.add(new Person("Ȳ����", 300));
		list.add(new Person("ũ����Ż", 400));
		
		System.out.println(list);
		
		Iterator<Person> it = list.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			total += it.next().getMoney(); // Generic ���� �̸� Person ���� ����
										   // -> getMoney() ��� ����
		}
		System.out.println(total);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
