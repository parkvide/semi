package com.kh.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/admin/home")
public class AdminHomeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     
			HttpSession session = req.getSession(false);

	        if (session == null || session.getAttribute("loginAdminVo") == null) {
	            // 로그인되지 않은 경우
	            resp.sendRedirect("/app/admin/login");
	        } else {
	            // 로그인된 경우
	            req.getRequestDispatcher("/WEB-INF/views/admin/admin.jsp").forward(req, resp);
	        }
	}
		


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
}
