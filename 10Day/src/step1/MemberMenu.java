package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private int menu;
	private boolean flag = true;
	private String menuStr = "1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 7.종료";
	
	// menuProcess
	public void menuProcess(ArrayList<Member> data) {
		int idx = 0;
		
		while (flag) {
			System.out.println(menuStr);
			menu = sc.nextInt();
			
			switch (menu) {
			
			case 1:
				data.add(infoInput());
				break;
				
			case 2:
				idx = search(data);
				printMember(data.get(idx));
				break;
				
			case 3:
				editMember(data);
				break;
			}
		}
	}
	
	// 등록
	public Member infoInput() {
		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("전화번호: ");
		String tel = sc.next();
		sc.nextLine();
		System.out.println("주소: ");
		String address = sc.nextLine();
		
		return new Member(name, tel, address);
	}
	
	// 검색
	public int search(ArrayList<Member> data) {
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		for (int i = 0; i < data.size(); i++) {
			if (name.equals(data.get(i).getName())) {
				return i;
			}
		}
		return 0;
	}
	
	// 출력
	public void printMember(Member m) {
		System.out.println(m);
	}
	
	// 수정
	public void editMember(ArrayList<Member> data) {
		int idx = search(data);
		System.out.println("새 전화번호: ");
		String tel = sc.next();
		sc.nextLine();
		System.out.println("새 주소: ");
		String address = sc.next();
		
		data.set(idx, new Member(data.get(idx).getName(), tel, address));
	}
	
}
