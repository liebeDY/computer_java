package step2;

import java.util.HashMap;

public class TestMap1 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		// ������ �߰� "Ű ��", "������"
		map.put("iu", "������");
		map.put("boa", "����");
		
		// ������ ���� ���
		System.out.println(map.size());
		
		// ������ ���� ���, Ű ���� �������� ����
		System.out.println(map);
		
		// Ű ������ ���
		System.out.println(map.get("boa"));
		
		// Ű ���� ���� �Ұ�, ������ ����
		map.put("iu", "����");
		System.out.println(map);

		// containsKey = Ű�� �˻��� true / false ��ȯ
		boolean flag = map.containsKey("iu");
		System.out.println(flag);
		
		// ����
		map.remove("iu");
		System.out.println(map);
		
		// isEmpty = �����Ͱ� �ִ��� Ȯ�� �� true / false ��ȯ
		System.out.println(map.isEmpty());
		
		// ������ ����
		map.clear();
		System.out.println(map.isEmpty());
	}
}
