package service;

import java.util.ArrayList;

import vo.MemberVo;

public class MemberService {

	private ArrayList<MemberVo> list = new ArrayList<MemberVo>();
	
	public void addMemberVO(MemberVo memberVo) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			MemberVo Mem = list.get(i);
			if (memberVo.equals(Mem.getId())) {
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
	
	public void printAll() {
	//System.out.println(list); // �̷��� �ᵵ ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println("ID: " + list.get(i).getId());
			System.out.println("�̸�: " + list.get(i).getName());
			System.out.println("Tel: " + list.get(i).getTel());
			System.out.println("�ּ�: " + list.get(i).getAdd());
			System.out.println();
		}
	}

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
	
	// remove ���
	public void deleteMemberVO(String id) {		
		
		for (int i = 0; i < list.size(); i++) {
			MemberVo pro1 = list.get(i);
			if (id.equals(pro1.getId())) {
				list.remove(i);
			}
		}
	}
	
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