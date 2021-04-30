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
 * Servlet implementation class LectureRegisterController
 */
@WebServlet("/lecture/regist.do")
public class LectureRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LectureRegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/lecture/registForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 깨지지 말라고 적어줘야함 무엇을?
		request.setCharacterEncoding("utf-8");
		String lectureName = request.getParameter("lectureName");
		String instructorName = request.getParameter("instructorName");
		String lectureIntroduce = request.getParameter("lectureIntroduce");
		Lecture lecture = new Lecture(lectureName, instructorName, lectureIntroduce);
		
		try {
			int result = new LectureServiceImpl().registLecture(lecture);
			if(result > 0) {
				response.setContentType("text/html;charset=utf-8"); ///////////////////////////////////////
				PrintWriter out = response.getWriter();
				out.println("<script>alert('강좌등록이 완료되었습니다.'); location.href='/lecture/list.do';</script>");
				out.flush();
				out.close();
			}else {
				System.out.println("result : 0");
			}
		}catch(Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
		
	}

}
