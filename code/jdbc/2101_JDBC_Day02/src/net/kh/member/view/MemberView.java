package net.kh.member.view;

import java.util.List;
import java.util.Scanner;

import net.kh.member.model.vo.Member;

public class MemberView {
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
			System.out.println("============회원관리 프로그램============");
			System.out.println("1. 회원정보 전체조회");
			System.out.println("2. 회원 아이디 조회");
			System.out.println("3. 회원 이름으로 검색");
			System.out.println("4. 회원가입");
			System.out.println("5. 회원 정보 변경");
			System.out.println("6. 회원탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호 선택: ");
			int choice = sc.nextInt();
			return choice;
	}
	
	public void printAll(List<Member> list) {
		System.out.println("조회된 전체 회원정보는 다음과 같습니다.");
		// for(int i = 0; i<list.size(); i++){
		// System.out.println("이름:" + list.get(i).getMemberName());
		// }
		// for-each문
		// list에 저장되어있는 모든 데이터를 멤버타입의 변수에 넣어줘라 
		// 단순 출력을 원할때 사용
		for(Member mOne : list) {
			System.out.println("이름: " + mOne.getMemberName() + "\t아이디: " + mOne.getMemberId()+ "\t전화번호: "
					+ mOne.getPhone() + "\t성별: " + mOne.getGender() + "\t나이: " + mOne.getAge() + "\t이메일: "
					+mOne.getEmail() + "\t주소: " +mOne.getAddress()+ "\t취미: " +mOne.getHobby() + "\t등록일: "
					+ "\t" + mOne.getEnrollDate());
		}
	}
	
	// 아이디을 입력받아서 조회
	public void printOne(Member member) {
		System.out.println("조회된 회원정보는 다음과 같습니다.");
		System.out.println("이름: "+ member.getMemberName()
							+ "\t아이디: " + member.getMemberId()
							+ "\t전화번호: " + member.getPhone()
							+ "\t이메일: "+member.getEmail()
							+ "\t나이: "+member.getAge()
							+ "\t성별: "+member.getGender());
	}
	
	// 이름을 입력받아서 조회 (동명이인을 생각해서 배열로 받음)
	public void printOne(List<Member> list) {
		System.out.println("조회된 회원정보는 다음과 같습니다.");
		for(Member memberOne : list) {
			System.out.println("이름: " + memberOne.getMemberName()
							+ "\t아이디: " + memberOne.getMemberId()
							+ "\t전화번호:" + memberOne.getPhone()
							+ "\t이메일: "+ memberOne.getEmail()
							+ "\t나이: " + memberOne.getAge()
							+ "\t성별: " + memberOne.getGender());
		}
	}

	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원의 아이디 입력 : ");
		return sc.next();
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원의 이름 입력: ");
		return sc.next();
	}
	
	public Member inputMember() {
		// 아이디 암호 이름 나이 성별 이메일 전화번호 주소 취미
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.print("아이디 입력 : ");
		member.setMemberId(sc.next()); 
		System.out.print("암호 입력 : ");
		member.setMemberPwd(sc.next());
		System.out.print("이름 입력 : ");
		member.setMemberName(sc.next());
		System.out.print("나이 입력 : ");
		member.setAge(sc.nextInt());
		System.out.print("성별 입력(M/F) : ");
		member.setGender(sc.next());
		System.out.print("이메일 입력 : ");
		member.setEmail(sc.next());
		System.out.print("전화번호 입력(-빼고입력) : ");
		member.setPhone(sc.next());
		sc.nextLine(); // 공백제거
		System.out.print("주소 입력 : ");
		member.setAddress(sc.nextLine());
		System.out.print("취미 입력(,로 공백없이 나열) : ");
		member.setHobby(sc.next());
		
		return member;
	}
	
	public Member modifyMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("============== 수정할 회원 정보를입력하세요 ===============");
		// 아이디, 비밀번호, 이메일, 폰번호, 주소
		Member member = new Member();
		System.out.print("수정할 회원의 아이디: ");
		String memberId = sc.next();
		member.setMemberId(memberId);
		System.out.print("수정할 암호: ");
		member.setMemberPwd(sc.next());
		System.out.print("수정할 이메일: ");
		member.setEmail(sc.next());
		System.out.print("수정할 전화번호(-빼고 입력) : ");
		member.setPhone(sc.next());
		sc.nextLine();
		System.out.println("수정할 주소 : ");
		member.setAddress(sc.nextLine());
		return member;
	}
	
	
	public void displaySuccess(String message) {
		System.out.println("서비스 요청 결과: "+ message);
	}
	public void displayError(String message) {
		System.out.println("서비스 요청 처리 실패: " + message);
	}
	
	
}
