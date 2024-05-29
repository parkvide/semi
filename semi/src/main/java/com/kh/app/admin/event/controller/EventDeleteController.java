package com.kh.app.admin.event.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.event.service.AdminEventService;

@WebServlet("/admin/evt/delete")
public class EventDeleteController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String no = req.getParameter("no");
			AdminEventService ss = new AdminEventService();
			int result = ss.delete(no);
			if(result == 1) {
				resp.sendRedirect("/admin/evt/list");
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
