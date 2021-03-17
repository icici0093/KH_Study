package member.controller;

import java.util.List;

import member.model.dao.MemberDAO;
import member.model.service.MemberService;
import member.model.vo.Member;
import member.view.MemberView;

public class MemberController {
	
	public MemberController() {} // 기본생성자
	
	public void printAll() {
//		MemberDAO mDao = new MemberDAO();
//		List<Member> list = mDao.printAll();
		// DAO의 부하를 줄이기 위해 Service 도입 
		MemberService mService = new MemberService();
		MemberView view = new MemberView();
		List<Member> list = mService.printAll();
		System.out.println("======== list : " + list.isEmpty());
		if(!list.isEmpty()) {
			view.showAllMember(list);
		}else {
			view.displayError("회원 정보 조회 실패");
		}
	}

	public void printOne(String inputMemberId) {
		// TODO Auto-generated method stub
		MemberService mService = new MemberService();
		MemberView view = new MemberView();
		Member member = mService.printOne(inputMemberId);
//		System.out.println("======== Service member : " + member.toString());
		if(member != null) {
			view.showMember(member);
		}else {
			view.displayError("회원 정보 조회 실패");
		}
	}

	public void printOneByName(String inputMemberName) {
		// TODO Auto-generated method stub
		MemberService mService = new MemberService();
		MemberView view = new MemberView();
		List<Member> list = mService.printOneByNAme(inputMemberName);
		if(!list.isEmpty()) {
			view.showAllMember(list);
		}else {
			view.displayError("회원 정보 조회 실패");
		}
		
	}

	public void registerMemeber(Member member) {
		MemberService service = new MemberService();
		MemberView view = new MemberView();
		int resultNum = service.insertMember(member);
		if(resultNum > 0) {
			view.displaySuccess("회원가입 성공");
		}else {
			view.displayError("회원가입 실패");
		}
	}
	
	public void modifyMember(Member member) {
		// TODO Auto-generated method stub
		MemberService mService = new MemberService();
		MemberView view = new MemberView();
		int result = mService.updateMember(member);
		if(result > 0) {
			view.displaySuccess("회원정보 수정 성공");
		}else {
			view.displayError("회원정보 수정 실패");
		}
		
	}

	public void deleteMember(String inputMemberId) {
		// TODO Auto-generated method stub
		MemberService mService = new MemberService();
		MemberView view = new MemberView();
		int result = mService.deleteMember(inputMemberId);
		if(result > 0) {
			view.displaySuccess("회원 탈퇴 성공");
		}else {
			view.displayError("회원 탈퇴 실패");
		}
	}

}
