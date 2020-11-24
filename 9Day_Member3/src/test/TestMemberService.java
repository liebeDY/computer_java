package test;

import service.Service;
import vo.MemberVo;

public class TestMemberService {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		service.addPerson(new MemberVo("java", "�迬��", "010-1", "����"));
		service.addPerson(new MemberVo("oracle", "ȫ�浿", "010-2", "����"));
		service.addPerson(new MemberVo("JSP", "��μ�", "010-3", "�Ⱦ�"));
		service.addPerson(new MemberVo("Ajax", "������", "010-4", "����"));
		service.addPerson(new MemberVo("Spring", "�տ���", "010-5", "����"));
		
		service.printAll();
		
		MemberVo vo = service.findMemberVO("java");
		if (vo != null) {
			System.out.println(vo);
		} else {
			System.out.println("ã�� id�� �����ϴ�.");
		}
		System.out.println();
		service.deleteMemberVO("java");
		service.printAll();
		
		boolean result = service.updateMemberVo(new MemberVo("Spring", "������", "010-6", "��õ"));
		
		if (result) {
			System.out.println("���� �Ϸ�");
		} else {
			System.out.println("��ǰ�� ��� ���� �Ұ�");
		}
		service.printAll();
	}

}
