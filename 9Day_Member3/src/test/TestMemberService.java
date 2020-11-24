package test;

import service.Service;
import vo.MemberVo;

public class TestMemberService {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		service.addPerson(new MemberVo("java", "김연아", "010-1", "서울"));
		service.addPerson(new MemberVo("oracle", "홍길동", "010-2", "구로"));
		service.addPerson(new MemberVo("JSP", "김민수", "010-3", "안양"));
		service.addPerson(new MemberVo("Ajax", "박지성", "010-4", "파주"));
		service.addPerson(new MemberVo("Spring", "손연재", "010-5", "수원"));
		
		service.printAll();
		
		MemberVo vo = service.findMemberVO("java");
		if (vo != null) {
			System.out.println(vo);
		} else {
			System.out.println("찾는 id가 없습니다.");
		}
		System.out.println();
		service.deleteMemberVO("java");
		service.printAll();
		
		boolean result = service.updateMemberVo(new MemberVo("Spring", "류현진", "010-6", "인천"));
		
		if (result) {
			System.out.println("수정 완료");
		} else {
			System.out.println("상품이 없어서 수정 불가");
		}
		service.printAll();
	}

}
