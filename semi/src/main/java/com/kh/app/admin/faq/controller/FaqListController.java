package com.kh.app.admin.faq.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.faq.service.AdminFaqService;
import com.kh.app.admin.faq.vo.AdminFaqVo;

@WebServlet("/admin/faq/list")
public class FaqListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			AdminFaqService afs = new AdminFaqService();
			List<AdminFaqVo> voList = afs.list();
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-faqlist.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	}
	
}
