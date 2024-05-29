package com.kh.app.admin.theater.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.theater.service.AdminTheaterService;

@WebServlet("/admin/theater/delete")
public class TheaterDeleteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String no = req.getParameter("no");
			AdminTheaterService ss = new AdminTheaterService();
			int result = ss.delete(no);
			if(result == 1) {
				resp.sendRedirect("/admin/theater/list");
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
