package org.kh.lecture.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.lecture.domain.Lecture;
import org.kh.lecture.service.LectureServiceImpl;

/**
 * Servlet implementation class LectureModifyController
 */
@WebServlet("/lecture/modify.do")
public class LectureModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LectureModifyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// UPDATE 버튼 누르면 동작
		int lectureNo = Integer.parseInt(request.getParameter("lectureId"));
		Lecture lecture = new LectureServiceImpl().printLectureOne(lectureNo);
		request.setAttribute("lecture", lecture);
		request.getRequestDispatcher("/WEB-INF/views/lecture/modify.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정버튼 누르면 동작
		request.setCharacterEncoding("utf-8");
		int lectureNo = Integer.parseInt(request.getParameter("lectureNo"));
		String lectureName = request.getParameter("lectureName");
		String instructorName = request.getParameter("instructorName");
		String introduce = request.getParameter("introduce");
		Lecture lecture = new Lecture(lectureNo, lectureName, instructorName, introduce);
		int result = new LectureServiceImpl().modifyLecture(lecture);
		if(result > 0) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('수정이 완료되었습니다'); location.href='/lecture/list.do';</script>");
			out.flush();
			out.close();
		}
	}

}
