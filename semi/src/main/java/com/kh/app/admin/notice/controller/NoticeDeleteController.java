package com.kh.app.admin.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.notice.service.AdminNoticeService;

@WebServlet("/admin/notice/delete")
public class NoticeDeleteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String no = req.getParameter("no");
			AdminNoticeService ss = new AdminNoticeService();
			int result = ss.delete(no);
			if(result == 1) {
				resp.sendRedirect("/admin/notice/list");
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
