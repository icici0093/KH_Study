package member.view;

import java.util.List;
import java.util.Scanner;

import member.model.vo.Member;

public class MemberView {
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 회원관리 프로그램 ========");
		System.out.println("1. 회원 전체정보 조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원정보 수정");
		System.out.println("6. 회원탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 선택 : ");
		int choice = sc.nextInt();
		return choice; // 값을 보내주기 위해 choice를 return으로 받음
	}
	
	public void showAllMember(List<Member> list) {
		System.out.println("조회된 전체 회원 정보는 다음과 같습니다.");
		for(Member member : list) {
			System.out.println("이름 : " + member.getMemberName() + 
					", 아이디 : " + member.getMemberId() + 
					", 성별 : " + member.getGender() + 
					", 전화번호 : " + member.getPhone() + 
					", 이메일 : " + member.getEmail() + 
					", 주소 : " + member.getAddress() + 
					", 등록일 : " + member.getEnrollDate());
		}
	}
	
	public void showMember(Member member) {
		System.out.println("조회된 회원 정보는 다음과 같습니다.");
			System.out.println("이름 : " + member.getMemberName() + 
					", 아이디 : " + member.getMemberId() + 
					", 성별 : " + member.getGender() + 
					", 전화번호 : " + member.getPhone() + 
					", 이메일 : " + member.getEmail() + 
					", 주소 : " + member.getAddress() + 
					", 등록일 : " + member.getEnrollDate());
	}
	
	public void displaySuccess(String message) {
		System.out.println("서비스 요청 결과 : " + message);
	}
	
	public void displayError(String message) {
		// TODO Auto-generated method stub
		System.out.println("서비스 요청 결과 : " + message);
	}


	public String inputMemberId() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원 ID 입력 : ");
		String memberId = sc.next();
		return memberId;
	}

	public String inputMemberName() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원 이름 입력 : ");
		return sc.next();
	}

	public Member inputMember() {
		// 아이디 암호 이름 나이 성별 이메일 전화번호 주소 취미
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.print("아이디 입력 : ");
		member.setMemberId(sc.next());
		System.out.print("비밀번호 입력 : ");
		member.setMemberPwd(sc.next());
		System.out.print("이름 입력 : ");
		member.setMemberName(sc.next());
		System.out.print("나이 입력 : ");
		member.setAge(sc.nextInt());
		System.out.print("성별 입력 : ");
		member.setGender(sc.next());
		System.out.print("이메일 입력 : ");
		member.setEmail(sc.next());
		System.out.print("전화번호 입력 : ");
		member.setPhone(sc.next());
		System.out.print("주소 입력 : ");
		sc.nextLine();
		member.setAddress(sc.nextLine());
		System.out.print("취미 입력 : ");
		member.setHobby(sc.next());
		
		return member;
	}

	public Member inputModifyMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 수정할 회원 정보를 입력하세요. ========");
		Member member = new Member();
		System.out.print("수정할 회원의 아이디 : ");
		member.setMemberId(sc.next());
		System.out.print("수정할 비밀번호 : ");
		member.setMemberPwd(sc.next());
		System.out.print("수정할 이메일 : ");
		member.setEmail(sc.next());
		System.out.print("수정할 주소 : ");
		sc.nextLine();
		member.setAddress(sc.nextLine());
		return member;
	}

}
