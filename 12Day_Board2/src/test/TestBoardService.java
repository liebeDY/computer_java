package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import service.BoardService;
import vo.EmpMember;
import vo.Member;
import vo.StuMember;
import vo.TeachMember;

public class TestBoardService {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String fileName = "school.obj";
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("게시판을 시작합니다.");
		
		String id;
		String Contents;
		String dept;
		String stuId;
		String subject;
		
		boolean flag = true;
		
		String i = "";
		String y = "";
		Member p = null;
		
		BoardService service = new BoardService();
		// service.loadData(fileName);
		
		while (flag) {
			
			System.out.println("1.글 입력 2.검색 3.수정 4.삭제 5.글 내용보기 6.종료");
			
			i = br.readLine();
			
			switch (i) {
			
			case "1": // 글 입력
				
				System.out.println("아이디를 입력하세요: ");
				id = br.readLine();
				System.out.println("내용을 입력하세요: ");
				Contents = br.readLine();
				
				System.out.println("1.교직원 2.학생 3.교사");
				y = br.readLine();
				
				switch (y) {
				
				case "1": // 직원
					System.out.println("부서를 입력하세요: ");
					dept = br.readLine();
					p = new EmpMember(id, Contents, dept);
					break;
					
				case "2": // 학생
					System.out.println("학번을 입력하세요: ");
					stuId = br.readLine();
					p = new StuMember(id, Contents, stuId);
					break;
					
				case "3": // 교사
					System.out.println("과목을 입력하세요:");
					subject = br.readLine();
					p = new TeachMember(id, Contents, subject);
					break;
				}
				break; // 1.글 입력 끝
				
			case "2": // 검색
				System.out.println("아이디를 입력하세요: ");
				id = br.readLine();
				Member m = service.findBoard(id);
				System.out.println(m);
				break;
				
			case "3": // 수정
				break;
				
			case "4": // 삭제
				break;
				
			case "5": // 출력
				break;
				
			case "6": // 종료
				break;
			}
		}
		
	}

}
