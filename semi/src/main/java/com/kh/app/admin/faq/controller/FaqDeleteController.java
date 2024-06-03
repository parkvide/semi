package com.kh.app.admin.faq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.faq.service.AdminFaqService;

@WebServlet("/admin/faq/delete")
public class FaqDeleteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String no = req.getParameter("no");
			AdminFaqService ss = new AdminFaqService();
			int result = ss.delete(no);
			if(result == 1) {
				resp.sendRedirect("/app/admin/faq/list");
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
