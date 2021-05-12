package com.iei.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iei.spring.member.domain.Member;
import com.iei.spring.member.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	// 로그인
	// 1. HttpServletRequest를 통해서 전송 받기
	// 2. @RequestParam 어노테이션 사용해서 전송받기
	//    @RequestParam("name값") String 변수명
	// 3. @RequestParam 어노테이션 생략 가능 - Keep
	// 4. @ModelAttribute 어노테이션 사용해서 전송받기
	//    - 요청페이지에서 전달할 파라미터가 많은 경우 사용
	//    - 객체 타입으로 값을 전달받을 수 있음.
	// (주의사항)
	//  1. VO클래스 기본생성자 존재
	//  2. setter메소드가 존재
	//  3. 요청페이지에서 name속성명이 domain(vo) 필드명(멤버변수명)과 같아야함. /////
	@RequestMapping(value="login.kh", method=RequestMethod.POST)
	public String memberLogin(HttpServletRequest request, 
							@ModelAttribute Member member,
							Model model) {
		///////////////////////////////////////////////
		// @RequestParam("userId") String userId,
		// @RequestParam("userPw") String userPw
		///////////////////////////////////////////////
		//String userId = request.getParameter("userId");
		//String userPw = request.getParameter("userPw");
		//Member member = new Member(userId, userPw);
		Member mOne = new Member(member.getUserId(), member.getUserPw());
		Member loginUser = service.loginMember(mOne);
		if(loginUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
			return "home";
		}else {
			//request.setAttribute("msg", "로그인 실패!!");
			model.addAttribute("msg", "로그인 실패!");
			return "common/errorPage";
		}
	}
	
	// 로그아웃
	@RequestMapping(value="logout.kh", method=RequestMethod.GET)
	public String memberLogout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:home.kh";
	}
	
	// 회원가입 폼
	@RequestMapping(value="enrollView.kh", method=RequestMethod.GET)
	public String enrollView() {
		return "member/memberJoin";
	}
	
	// 회원등록
	@RequestMapping(value="memberRegister.kh", method=RequestMethod.POST)
	public String memberRegister(
				@ModelAttribute Member member, 
				@RequestParam("post") String post,
				@RequestParam("address1") String address1,
				@RequestParam("address2") String address2,
				Model model) {
		member.setUserAddr(post+","+address1+","+address2);
		int result = service.registerMember(member);
		if(result > 0) {
			return "redirect:home.kh";
		}else {
			model.addAttribute("msg", "회원 가입 실패!!");
			return "common/errorPage";
		}
	}
	
	// 마이페이지 뷰
	@RequestMapping(value="myInfo.kh", method=RequestMethod.GET)
	public String myInfoView() {
		return "member/myPage"; // /WEB-INF/views/member/myPage.jsp
	}
	
	// 정보수정
	@RequestMapping(value="memberModify.kh", method=RequestMethod.POST)
	public String modifyMember(@ModelAttribute Member member,
							@RequestParam("post") String post,
							@RequestParam("address1") String address1,
							@RequestParam("address2") String address2,
							Model model,
							HttpServletRequest request) {
		// 문제가 뭐였냐면 수정을 해도 마이페이지에서 수정된 정보로 나오지 않았음
		// 마이페이지 정보는 세션에서 가지고 오는데 수정을 성공한 후에
		// 세션에 있는 정보를 업데이트 하지 않아서 발생한 오류
		// 정보수정이 성공한 후에 해당 데이터를 세션에 새로 담아주어야 오류가 없음
		HttpSession session = request.getSession();
		member.setUserAddr(post+","+address1+","+address2);
		int result = service.modifyMember(member);
		if(result > 0) {
			session.setAttribute("loginUser", member);
			return "redirect:home.kh";
		}else {
			model.addAttribute("msg", "정보 수정 실패");
			return "common/errorPage";
		}
	}
	
	// 회원탈퇴 
	@RequestMapping(value="memberDelete.kh", method=RequestMethod.GET)
	public String deleteMember(@RequestParam("userId") String userId, Model model) {
		// 회원탈퇴를 하고나서 세션파괴를 하지 않으면
		// 로그인한 상태가 유지되므로 세션파괴를 해줘야 함.
		int result = service.deleteMember(userId);
		if(result > 0) {
			return "redirect:logout.kh";
		}else {
			model.addAttribute("msg", "탈퇴 실패");
			return "common/errorPage";
		}
	}
	
	// 아이디 중복 검사
	@ResponseBody //spring에서 ajax를 사용하기 위해 써줘야 함 
	@RequestMapping(value="dupId.kh", method=RequestMethod.GET)
	public String idDuplicateCheck(@RequestParam("userId") String userId) {
		// return service.checkIdDup(userId)+"";
		// checkIdDup은 int형이므로 공백("")을 붙여 String형으로 만들어줌
		
		return String.valueOf(service.checkIdDup(userId)); //
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
