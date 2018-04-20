package kr.co.gdu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calc extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()!");
		action(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()!");
		action(request, response);
	}
	
	protected void action(HttpServletRequest request, HttpServletResponse response) {

		try {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String key = request.getParameter("key");
		boolean check = true;
		System.out.println("a : " + a + ", b : " + b + ", key : " + key);
		
		Calculator Ca = new Calculator();
		int result = 0;
		switch (key) {
		case "add":
			result = Ca.add(Integer.parseInt(a), Integer.parseInt(b));
			break;
		case "subtract":
			result = Ca.subtract(Integer.parseInt(a), Integer.parseInt(b));
			break;
		case "multiply":
			result = Ca.multiply(Integer.parseInt(a), Integer.parseInt(b));
			break;
		case "divide":
			result = Ca.divide(Integer.parseInt(a), Integer.parseInt(b));
			break;
		default:
			check = false;
			break;
		}
		
		System.out.println("답 : " + result);
		
		response.setContentType("text/html; charset=UTF-8");
		
		String HTML = "<h2>계산의 결과값 : " + result + "</h2>";
					HTML += "<a href='index.html'>계산기로 이동하자</a>";
		
		response.getWriter().append(HTML);
		
//		if(check) {
//			request.setAttribute("result", result);
//			RequestDispatcher RD = request.getRequestDispatcher("result.jsp");
//			RD.forward(request, response);
//		} else {
//			response.sendRedirect("index.html");
//		}
		
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("종료함.");
		}
		
	}
	
}
