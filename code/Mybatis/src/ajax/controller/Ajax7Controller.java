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
 * Servlet implementation class Ajax7Controller
 */
@WebServlet("/ajax/test7")
public class Ajax7Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajax7Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		// sel1 값이 1 일때
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		// sel1 값이 2 일때
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		list2.add(55);
		int sel1 = Integer.parseInt(request.getParameter("sel1"));
		JSONArray jArr = new JSONArray();
		if( sel1 == 1) {
			for(int i : list1) {
				JSONObject obj = new JSONObject();
				obj.put("num", i);
				jArr.add(obj);
			}
		}else if(sel1 == 2) {
			for(int i : list2) {
				JSONObject obj = new JSONObject();
				obj.put("num", i);
				jArr.add(obj);
			}
		}
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(jArr);
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
