package org.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.domain.Member;
import org.kh.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberSearchController
 */
@WebServlet("/member/search.do")
public class MemberSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String searchType = request.getParameter("searchType");
		String searchKeyword = request.getParameter("searchKeyword");
		HashMap<String, String> searchMap = new HashMap<String, String>();
		searchMap.put("searchType", searchType);
		searchMap.put("keyword", searchKeyword);
		ArrayList<Member> mList = new MemberServiceImpl().findMemberList(searchMap);
		request.setAttribute("members", mList);
		request.setAttribute("searchType", searchType);
		request.setAttribute("searchKeyword", searchKeyword);
		request.getRequestDispatcher("/WEB-INF/views/member/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
