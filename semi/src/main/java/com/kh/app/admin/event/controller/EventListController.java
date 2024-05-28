package com.kh.app.admin.event.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.event.vo.AdminEventVo;
import com.kh.app.admin.event.service.AdminEventService;

@WebServlet("/admin/evt/list")
public class EventListController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			AdminEventService aes = new AdminEventService();
			List<AdminEventVo> voList = aes.list();
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-evtlist.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
