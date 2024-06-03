package com.kh.app.admin.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.notice.service.AdminNoticeService;
import com.kh.app.admin.notice.vo.AdminNoticeVo;

@WebServlet("/admin/notice/edit")
public class NoticeEditController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			try {
				
				String no = req.getParameter("no");
				
				AdminNoticeService ans = new AdminNoticeService();
				AdminNoticeVo adminNoticeList = (AdminNoticeVo)ans.selectOne(no);
				
				req.setAttribute("adminNoticeList", adminNoticeList);
				req.getRequestDispatcher("/WEB-INF/views/admin/admin-noticeEdit.jsp").forward(req, resp);
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			String no = req.getParameter("no");
			String content = req.getParameter("content");
			
			AdminNoticeVo vo = new AdminNoticeVo();
			vo.setNo(no);
			vo.setContent(content);
			
			AdminNoticeService ans = new AdminNoticeService();
			int result = ans.edit(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/notice/list");
			}else {
				System.out.println("수정하다 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
}
