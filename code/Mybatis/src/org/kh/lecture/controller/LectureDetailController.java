package org.kh.lecture.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.lecture.domain.Lecture;
import org.kh.lecture.service.LectureServiceImpl;

/**
 * Servlet implementation class LectureDetailController
 */
@WebServlet("/lecture/detail.do")
public class LectureDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LectureDetailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int lectureNo = Integer.parseInt(request.getParameter("lectureId"));  ////////////////// 오류는 왜 뜨는 것인가?
		Lecture lecture = new LectureServiceImpl().printLectureOne(lectureNo);
		request.setAttribute("lecture", lecture);
		request.getRequestDispatcher("/WEB-INF/views/lecture/detail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
