package com.kh.app.admin.cinema.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.cinema.service.AdminCinemaService;
import com.kh.app.admin.cinema.vo.AdminCinemaVo;

@WebServlet("/admin/cinema/list")
public class CinemaListController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			
			AdminCinemaService acs = new AdminCinemaService();
			List<AdminCinemaVo> voList = acs.list();
		
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-cinemali0st.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
