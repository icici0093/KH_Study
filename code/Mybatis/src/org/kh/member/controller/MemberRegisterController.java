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
 * Servlet implementation class MemberRegisterController
 */
@WebServlet("/member/register.do")
public class MemberRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberRegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/registForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); ////////////////////////////////////////////////////
		String userId = request.getParameter("userId"); // 1
		String userPwd = request.getParameter("userPwd"); // 2
		String userName = request.getParameter("userName"); // 3
		String userAddr = request.getParameter("userAddr"); // 4
		Member member = new Member();
		member.setUserId(userId);
		member.setUserPw(userPwd);
		member.setUserName(userName);
		member.setUserAddr(userAddr);
		
		try {
			int result = new MemberServiceImpl().registMember(member);
			if(result > 0) {
				response.setContentType("text/html;charset=utf-8"); ///////////////////////////////////////
				PrintWriter out = response.getWriter();
				out.println("<script>alert('회원가입이 완료되었습니다.'); location.href='/index.jsp';</script>");
				out.flush();
				out.close();
			}
		} catch(Exception e) {
			e.printStackTrace(); // 콘솔용 오류 출력
			request.setAttribute("msg", e.getMessage()); // 화면용 오류 출력
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
	}

}
