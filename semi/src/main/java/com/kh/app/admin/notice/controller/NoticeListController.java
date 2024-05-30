package com.kh.app.admin.notice.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.notice.service.AdminNoticeService;
import com.kh.app.admin.notice.vo.AdminNoticeVo;

@WebServlet("/admin/notice/list")
public class NoticeListController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			AdminNoticeService ans = new AdminNoticeService();
			List<AdminNoticeVo> adminNoticevoList = ans.list();
			
			req.setAttribute("adminNoticevoList", adminNoticevoList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-notlist.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	

}
