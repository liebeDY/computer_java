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
		
		System.out.println("�Խ����� �����մϴ�.");
		
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
			
			System.out.println("1.�� �Է� 2.�˻� 3.���� 4.���� 5.�� ���뺸�� 6.����");
			
			i = br.readLine();
			
			switch (i) {
			
			case "1": // �� �Է�
				
				System.out.println("���̵� �Է��ϼ���: ");
				id = br.readLine();
				System.out.println("������ �Է��ϼ���: ");
				Contents = br.readLine();
				
				System.out.println("1.������ 2.�л� 3.����");
				y = br.readLine();
				
				switch (y) {
				
				case "1": // ����
					System.out.println("�μ��� �Է��ϼ���: ");
					dept = br.readLine();
					p = new EmpMember(id, Contents, dept);
					break;
					
				case "2": // �л�
					System.out.println("�й��� �Է��ϼ���: ");
					stuId = br.readLine();
					p = new StuMember(id, Contents, stuId);
					break;
					
				case "3": // ����
					System.out.println("������ �Է��ϼ���:");
					subject = br.readLine();
					p = new TeachMember(id, Contents, subject);
					break;
				}
				break; // 1.�� �Է� ��
				
			case "2": // �˻�
				System.out.println("���̵� �Է��ϼ���: ");
				id = br.readLine();
				Member m = service.findBoard(id);
				System.out.println(m);
				break;
				
			case "3": // ����
				break;
				
			case "4": // ����
				break;
				
			case "5": // ���
				break;
				
			case "6": // ����
				break;
			}
		}
		
	}

}
