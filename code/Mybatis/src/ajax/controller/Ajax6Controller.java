package ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class Ajax6Controller
 */
@WebServlet("/ajax/test6")
public class Ajax6Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajax6Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int findNum = Integer.parseInt(request.getParameter("findNum"));
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User(1, "일용자", "서울"));
		userList.add(new User(2, "이용자", "부산"));
		userList.add(new User(3, "삼용자", "울산"));
		userList.add(new User(4, "사용자", "원주"));
		userList.add(new User(5, "오용자", "나주"));
		
		JSONArray userArr = new JSONArray();
		if(findNum  >= 1 && findNum <= 5) {
			User user = userList.get(findNum - 1);
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("userNo", user.getUserNo());
			jsonObj.put("userName", user.getUserName());
			jsonObj.put("userAddr", user.getUserAddr());
			userArr.add(jsonObj);
		}else {
			for(User user : userList) {
				JSONObject jsonObj = new JSONObject();
				jsonObj.put("userNo", user.getUserNo());
				jsonObj.put("userName", user.getUserName());
				jsonObj.put("userAddr", user.getUserAddr());
				userArr.add(jsonObj);
			}
		}
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		////////////////////////////////////////////////////////////
		PrintWriter out = response.getWriter();
		out.print(userArr);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
