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
			System.out.println("이미 등록된 아이디 입니다.");
		}
	}
	
	public void printAll() {
	//System.out.println(list); // 이렇게 써도 됨
		for (int i = 0; i < list.size(); i++) {
			System.out.println("ID: " + list.get(i).getId());
			System.out.println("이름: " + list.get(i).getName());
			System.out.println("Tel: " + list.get(i).getTel());
			System.out.println("주소: " + list.get(i).getAdd());
			System.out.println();
		}
	}

	// pro = 데이터를 담을 빈 변수 , pro1 = 비교할 데이터를 넣을 변수
	// 조건이 맞는다면 pro1을 pro 에 담고 return
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
	
	// remove 사용
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