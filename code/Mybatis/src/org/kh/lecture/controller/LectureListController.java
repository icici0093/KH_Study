package org.kh.lecture.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.lecture.domain.Lecture;
import org.kh.lecture.service.LectureServiceImpl;

/**
 * Servlet implementation class LectureListController
 */
@WebServlet("/lecture/list.do")
public class LectureListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LectureListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Lecture> list = new LectureServiceImpl().printLectureAll();
		try {
			if(!list.isEmpty()) {
				request.setAttribute("lectureList", list);
			}else {
				request.setAttribute("lectureList", "");
			}
			request.getRequestDispatcher("/WEB-INF/views/lecture/list.jsp").forward(request, response);
		} catch(Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
