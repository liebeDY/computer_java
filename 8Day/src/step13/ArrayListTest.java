package step13;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>(); // ���ʸ� Generic : Ÿ���� �̸� ����
		
		// ArrayList �� [0]���� ����
		al.add("aaa"); // [0]
		al.add("bbb"); // [1]
		al.add(1, "ccc");  // [1] �� ccc
		al.set(2, "ddd");  // [2] �� ddd

		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + " ��° ���:" + al.get(i));
		}
		
		System.out.println("�˻��� ���� �Է��϶�");
		
		String srh = sc.next();
		int idx = 0;
		
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			System.out.println(idx + " ��ġ���� " + al.get(idx) + " �˻�");
		} else {
			System.out.println("ã�� ���� ����");
		}
		
		System.out.println("������ ���� �Է��϶�");
		srh = sc.next();
		idx = 0;
		
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			al.remove(idx);
		} else {
			System.out.println("ã�� ���� ����");
		}
		
		System.out.println(al);
		
		System.out.println("��ü ����");
		
		al.removeAll(al);
		
		if (al.isEmpty()) {
			System.out.println("����Ʈ�� �����.");
		} else {
			for (int i = 0; i < al.size(); i++) {
				System.out.println(i + " ��° ���: " + al.get(i));
			}
		}
	}
}
