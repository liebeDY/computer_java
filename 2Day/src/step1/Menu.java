package step1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id = null;
		String name = null;
		String tel = null;
		String addr = null;
		boolean flag = true;
		int i = 0;
		
		while(flag) {
			
			System.out.println("1.등록");
			System.out.println("2.전체출력");
			System.out.println("3.종료");
			i = sc.nextInt();
			
			switch(i) {
				
			case 1 :
				System.out.println("아이디를 입력하세요 : ");
				id = sc.next();
				System.out.println("이름을 입력하세요 : ");
				name = sc.next();
				System.out.println("전화번호를 입력하세요 : ");
				tel = sc.next();
				System.out.println("주소를 입력하세요 : ");
				addr = sc.next();
				System.out.println();
				break;
			case 2 :
				System.out.println("아이디 : " + id);
				System.out.println("이름 : " + name);
				System.out.println("전화번호 : " + tel);
				System.out.println("주소 : " + addr);
				System.out.println();
				break;
				
			case 3 :
				flag = false;
				break;
				
			}
		}
		
		
	}

}
