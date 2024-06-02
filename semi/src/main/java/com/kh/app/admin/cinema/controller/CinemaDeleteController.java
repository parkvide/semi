package com.kh.app.admin.cinema.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.admin.cinema.service.AdminCinemaService;
import com.kh.app.admin.cinema.vo.AdminCinemaVo;

@WebServlet("/admin/cinema/delete")
public class CinemaDeleteController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			HttpSession session = req.getSession();
			
			String no = req.getParameter("no");
			
			AdminCinemaVo adminCinemaVo = new AdminCinemaVo();
			adminCinemaVo.setNo(no);
			
			
			AdminCinemaService ss = new AdminCinemaService();
			int result = ss.delete(no);
			
			if(result == 1) {
				resp.sendRedirect("/admin/cinema/list");
			} else {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	

}
