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
		System.out.println("�Խ����� �����մϴ�.");
		
		String id;
		String Contents;
		boolean flag = true;
		String i = "";
		
		BoardService service = new BoardService();
		
		// service.loadData(fileName);
		
		while (flag) {
			
			System.out.println("1.�� �Է� 2.�˻� 3.���� 4.���� 5.�� ���뺸�� 6.����");
			
			i = br.readLine(); //��ĳ�� ���
			
			switch (i) {
			
			case "1" :
				System.out.println("���̵� �Է��ϼ���: ");
				id = br.readLine();
				System.out.println("������ �Է��ϼ���: ");
				Contents = br.readLine();
				
				service.insertBoard(new Member(id, Contents));
				service.saveData(fileName);
				break;
				
			case "2" :
				System.out.println("���̵� �Է��ϼ���: ");
				id = br.readLine();
				Member m = service.findBoard(id);
				
				System.out.println(m);
				break;
			}
		}
		
	}

}
