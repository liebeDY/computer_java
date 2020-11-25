package step4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		// FriendVo를 넣기 
		map.put("a", new FriendVo("손연재", "태릉", 200));
		map.put("b", new FriendVo("크리스탈", "노량진", 300));
		map.put("c", new FriendVo("소지섭", "판교", 400));
		
		System.out.println(map);
		
		FriendVo vo = (FriendVo)map.get("c");
		System.out.println(vo.getName() + " " + vo.getAddress());
		
		System.out.println(map.get("c"));
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		Collection col = map.values();
		Iterator it2 = col.iterator();
		
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
