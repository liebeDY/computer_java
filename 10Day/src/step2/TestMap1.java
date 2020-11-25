package step2;

import java.util.HashMap;

public class TestMap1 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		// 데이터 추가 "키 값", "데이터"
		map.put("iu", "아이유");
		map.put("boa", "보아");
		
		// 데이터 길이 출력
		System.out.println(map.size());
		
		// 데이터 내용 출력, 키 값을 기준으로 접근
		System.out.println(map);
		
		// 키 값으로 출력
		System.out.println(map.get("boa"));
		
		// 키 값은 변경 불가, 데이터 수정
		map.put("iu", "현아");
		System.out.println(map);

		// containsKey = 키를 검색후 true / false 반환
		boolean flag = map.containsKey("iu");
		System.out.println(flag);
		
		// 삭제
		map.remove("iu");
		System.out.println(map);
		
		// isEmpty = 데이터가 있는지 확인 후 true / false 반환
		System.out.println(map.isEmpty());
		
		// 데이터 비우기
		map.clear();
		System.out.println(map.isEmpty());
	}
}
