package net.kh.member.controller;

import java.util.List;

import net.kh.member.model.dao.MemberDAO;
import net.kh.member.model.vo.Member;
import net.kh.member.view.MemberView;

public class MemberController {
	
	public MemberController() {}
	
	public void printAll() {
		MemberDAO mDao = new MemberDAO();
		MemberView view = new MemberView();
		
		// 왜 Arraylist 로 받지 않고 list로 받을까?
		// list는 Arraylist의 부모다. => 다형성 
		List<Member> list = mDao.selectList();
		if(!list.isEmpty()) {
			// 출력
			view.printAll(list);
		}else {
			// 실패 메시지 출력
		}
	}
	
	public void printOne(String memberId) {
		MemberDAO mDao = new MemberDAO();
		MemberView view = new MemberView();
		Member member = mDao.selectOneById(memberId);
		
		if(member != null) {
			// 출력
			view.printOne(member);
		}else {
			//실패 메시지 출력
		}
	}
	
	public void printOneByName(String memberName) {
		MemberDAO mDao = new MemberDAO();
		MemberView view = new MemberView();
		List<Member> list = mDao.selectOneByName(memberName);
		
		if(!list.isEmpty()) {
			// 출력
			view.printOne(list);
		}else {
			// 실패 메시지 출력
			view.displayError("회원정보출력실패");
		}
	}

	public void registerMember(Member inputMember) {
		// TODO Auto-generated method stub
		MemberDAO mDao = new MemberDAO();
		MemberView view = new MemberView();
		int resultNum = mDao.insertMember(inputMember);
		if(resultNum > 0) {
			//성공메세지 출력
			view.displaySuccess("회원가입성공");
		}else {
			//실패 메세지 출력
			view.displayError("회원가입실패");
		}
	}

	public void deleteMember(String inputMemberId) {
		// TODO Auto-generated method stub
		MemberDAO mDao = new MemberDAO();
		MemberView view = new MemberView();
		int result = mDao.deleteMember(inputMemberId);
		if(result > 0) {
			view.displaySuccess("회원 탈퇴 성공!");
		}else {
			view.displayError("회원 탈퇴 실패!");
		}
	}

	public void modifyMember(Member modifyMember) {
		// TODO Auto-generated method stub
		MemberDAO mDao = new MemberDAO();
		MemberView view = new MemberView();
		int result = mDao.updateMember(modifyMember);
		// result 결과값에 따라서 
		// 성공, 실패 메시지 출력
		if(result>0) {
			view.displaySuccess("회원 정보 수정 성공!");
		}else {
			view.displayError("회원 정소 수정 실패!");
		}
	}
	
}
