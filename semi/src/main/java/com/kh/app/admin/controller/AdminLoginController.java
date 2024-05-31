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
			HttpSession session = req.getSession();
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");

			AdminVo vo = new AdminVo();
			vo.setId(id);
			vo.setPwd(pwd);

			AdminService ad = new AdminService();
			AdminVo loginAdminVo = ad.login(vo);

			if (loginAdminVo != null) {
				session.setAttribute("loginAdminVo", loginAdminVo);
				resp.sendRedirect("/app/admin/home");				
			}else {
				resp.sendRedirect("/app/admin/login");
			}
			// 로그인 성공
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException("로그인 중 문제가 발생했습니다.", e);
		}

	}
}
