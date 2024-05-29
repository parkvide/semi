package com.kh.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.admin.service.AdminService;
import com.kh.app.admin.vo.AdminVo;

@WebServlet("/admin/login")
public class AdminLoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/admin/admin-login.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");

			AdminVo vo = new AdminVo();
			vo.setId(id);
			vo.setPwd(pwd);

			AdminService ad = new AdminService();
			AdminVo loginAdminVo = ad.login(vo);

			HttpSession session =req.getSession();
			if (loginAdminVo == null) {
				session.setAttribute("alertMsg", "로그인실패");
			    resp.sendRedirect("/app/admin/login");
			    return;
			} 
			// 로그인 성공
			session.setAttribute("alertMsg" , "로그인성공");
			session.setAttribute("loginAdminVo", loginAdminVo);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin.jsp").forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
