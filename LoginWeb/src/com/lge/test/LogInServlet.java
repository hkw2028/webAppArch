package com.lge.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/Login.do")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 요청 분석 및 데이터 추출
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String passWord = request.getParameter("passWord");
		// 2. 데이터 저장
		//    2.1. Session
		//    2.2. Request
		//    2.3. Servlet
		HttpSession session = request.getSession();
		session.setAttribute("msg", "처리 완료");
		session.setAttribute("userId", userId);
		request.getRequestDispatcher("result.jsp").forward(request, response);
		// response.sendRedirect("result.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
