package ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ajax4Controller
 */
@WebServlet("/ajax/test4")
public class Ajax4Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajax4Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// jsp에서 데이터 받는 부분
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		// jsp로 데이터 보내는 부분
		PrintWriter out = response.getWriter();
		out.print(number1 + number2);
		out.flush();
		out.close();
		// ajax로 처리하는 부분이 단순히 String값으로만 하는 것이 아닌
		// 여러 데이터를 묶어서 처리를 해야 함
		// 댓글한다고 했을때, 댓글의 내용, 댓글의 작성날짜, 작성자 등등의 정보를
		// 보내줘야함
		// 이러한 데이터를 효율적으로 전송하기 위해 JSON 데이터 형식을 사용함
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
