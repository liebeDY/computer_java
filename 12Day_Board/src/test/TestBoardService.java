package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import service.BoardService;
import vo.Member;

public class TestBoardService {

	public static void main(String[] args) throws IOException {

		String fileName = "school.obj";
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(ir);
		System.out.println("게시판을 시작합니다.");
		
		String id;
		String Contents;
		boolean flag = true;
		String i = "";
		
		BoardService service = new BoardService();
		
		// service.loadData(fileName);
		
		while (flag) {
			
			System.out.println("1.글 입력 2.검색 3.수정 4.삭제 5.글 내용보기 6.종료");
			
			i = br.readLine(); //스캐너 기능
			
			switch (i) {
			
			case "1" :
				System.out.println("아이디를 입력하세요: ");
				id = br.readLine();
				System.out.println("내용을 입력하세요: ");
				Contents = br.readLine();
				
				service.insertBoard(new Member(id, Contents));
				service.saveData(fileName);
				break;
				
			case "2" :
				System.out.println("아이디를 입력하세요: ");
				id = br.readLine();
				Member m = service.findBoard(id);
				
				System.out.println(m);
				break;
			}
		}
		
	}

}
