package test;

import java.util.Scanner;

import service.MemberService;
import vo.MemberVo;

public class TestMemberService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		String name;
		String tel;
		String addr;

		boolean flag = true;

		int i = 0;

		MemberService service = new MemberService();

		while (flag) {

			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.출력");
			System.out.println("6.종료");
			i = sc.nextInt();

			switch (i) {

			case 1: // 등록
				System.out.println("Id를 입력하세요");
				id = sc.next();
				System.out.println("이름을 입력하세요");
				name = sc.next();
				System.out.println("전화번호를 입력하세요");
				tel = sc.next();
				System.out.println("주소를 입력하세요");
				addr = sc.next();
				service.addMemberVO(new MemberVo(id, name, tel, addr));
				break;

			case 2: // 검색
				System.out.println("검색할 Id를 입력하세요");
				id = sc.next();
				MemberVo vo = service.findMemberVO(id);

				if (vo != null) {
					System.out.println(vo);
				} else {
					System.out.println("Id가 없습니다.");
				}
				break;

			case 3: // 수정
				System.out.println("수정할 Id를 입력하세요");
				id = sc.next();
				System.out.println("수정할 이름을 입력하세요");
				name = sc.next();
				System.out.println("수정할 전화번호를 입력하세요");
				tel = sc.next();
				System.out.println("수정할 주소를 입력하세요");
				addr = sc.next();

				MemberVo m2 = new MemberVo(id, name, tel, addr);
				service.updateMemberVo(m2);
				break;

			case 4: // 삭제
				System.out.println("삭제할 Id를 입력하세요");
				id = sc.next();
				service.deleteMemberVO(id);
				break;

			case 5: // 출력
				service.printAll();
				break;

			case 6: // 종료
				System.out.println("종료합니다");
				flag = false;
				break;
			}
		}
	}
}