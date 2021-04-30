package org.kh.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.domain.Member;
import org.kh.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberUpdateController
 */
@WebServlet("/member/update.do")
public class MemberUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		Member member = new MemberServiceImpl().printMemberOneById(userId);
		request.setAttribute("member", member);
		request.getRequestDispatcher("/WEB-INF/views/member/modify.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// form태그 method가 post이면 doPost 실행됨
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); ////////////////////////////// 한글 안깨지게 고쳐줌
		String userPw = request.getParameter("userPwd");
		String userAddr = request.getParameter("userAddr");
		String userId = request.getParameter("userId"); //////// hidden으로 가져왔음
		Member member = new Member();
		member.setUserPw(userPw);
		member.setUserAddr(userAddr);
		member.setUserId(userId); // 넘겨줘야 되는 정보가 3개니까 member에다가 담아서 한꺼번에 넘김
		try {
			int result = new MemberServiceImpl().modifyMember(member);
			if(result > 0) {
				response.setContentType("text/html;charset=utf-8"); // 한글깨지지 말라고
				PrintWriter out = response.getWriter();
				out.println("<script>alert('정보 수정이 완료되었습니다.'); location.href='/member/list.do';</script>");
				out.flush(); // 출력스트림 비워줘야 되니까
				out.close();
			}
		}catch(Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
		// UPDATE MEMBER SET USER_PW = #{userPw }, USER_ADDR = #{userAddr } WHERE USER_ID = #{userId }
	}

}
