package step3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {

		// HashMap ���� generic ���� �ΰ��� ���� -> key, value
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("�б���", "���ѹα��б�");
		map.put("�а���", "��ǻ�Ͱ��а�");
		map.put("�г�", "3�г�");

		String key, value;
		System.out.println("iterator �� key�� ����");
		
		// Set : �ߺ� ��� x , ���� ���� x
		// keySet : key�� �ߺ��Ǵ��� Ȯ��, key�� �˻�
		Iterator<String> keyIterator = map.keySet().iterator();
		
		while(keyIterator.hasNext()) {
			key = keyIterator.next();
			value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
