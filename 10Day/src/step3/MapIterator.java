package step3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {

		// HashMap 에서 generic 사용시 두가지 지정 -> key, value
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학교명", "대한민국학교");
		map.put("학과명", "컴퓨터공학과");
		map.put("학년", "3학년");

		String key, value;
		System.out.println("iterator 를 key에 연결");
		
		// Set : 중복 허용 x , 순서 정렬 x
		// keySet : key가 중복되는지 확인, key를 검색
		Iterator<String> keyIterator = map.keySet().iterator();
		
		while(keyIterator.hasNext()) {
			key = keyIterator.next();
			value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
