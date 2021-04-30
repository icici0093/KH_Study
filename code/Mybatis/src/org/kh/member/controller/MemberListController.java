package org.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.domain.Member;
import org.kh.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberListController
 */
@WebServlet("/member/list.do")
public class MemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberServiceImpl mService = new MemberServiceImpl();
		ArrayList<Member> mList = mService.printAllList();
//		if(!mList.isEmpty()) {
			request.setAttribute("members", mList);
			request.getRequestDispatcher("/WEB-INF/views/member/list.jsp").forward(request, response);
//		}else {
//			request.setAttribute("msg", "Fail");
//			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
