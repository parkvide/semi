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

@WebServlet("/admin/notic/list")
public class NoticeListController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			AdminNoticeService ans = new AdminNoticeService();
			List<AdminNoticeVo> voList = ans.list();
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-notlist.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	

}
