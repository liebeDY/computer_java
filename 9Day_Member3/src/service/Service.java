package service;

import java.util.ArrayList;

import vo.MemberVo;

public class Service {

	private ArrayList<MemberVo> list = new ArrayList<MemberVo>();

	// addPerson
	public void addPerson(MemberVo memberVo) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			MemberVo m = list.get(i);
			if (m.equals(m.getId())) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			list.add(memberVo);
		} else {
			System.out.println("�̹� ��ϵ� ���̵� �Դϴ�.");
		}
	}

	// printAll
	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("ID: " + list.get(i).getId());
			System.out.println("�̸�: " + list.get(i).getName());
			System.out.println("Tel: " + list.get(i).getTel());
			System.out.println("�ּ�: " + list.get(i).getAdd());
			System.out.println();
		}
	}

	// findMember
	// pro = �����͸� ���� �� ���� , pro1 = ���� �����͸� ���� ����
	// ������ �´´ٸ� pro1�� pro �� ��� return
	public MemberVo findMemberVO(String id) {
		MemberVo pro = null;

		for (int i = 0; i < list.size(); i++) {
			MemberVo pro1 = list.get(i);
			if (id.equals(pro1.getId())) {
				pro = pro1;
			}
		}
		return pro;
	}

	// deleteMember
	// remove ���
	public void deleteMemberVO(String id) {

		for (int i = 0; i < list.size(); i++) {
			MemberVo pro1 = list.get(i);
			if (id.equals(pro1.getId())) {
				list.remove(i);
			}
		}
	}

	// updateMember
	public boolean updateMemberVo(MemberVo memberVo) {
		boolean flag = false;
		
		for (int i = 0; i < list.size(); i++) {
			MemberVo Mem = list.get(i);
			if (Mem.getId().equals(memberVo.getId())) {
				list.set(i, memberVo);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
