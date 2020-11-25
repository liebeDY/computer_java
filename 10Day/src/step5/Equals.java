package step5;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pwd = "1234";
		
		System.out.println("id: ");
		String id_str = sc.next();
		
		System.out.println("pwd: ");
		String id_pwd = sc.next();
		
		if (id.equals(id_str) && pwd.equals(id_pwd)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		sc.close();
	}
}
