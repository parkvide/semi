package com.kh.app.admin.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.notice.service.AdminNoticeService;
import com.kh.app.admin.notice.vo.AdminNoticeVo;

@WebServlet("/admin/notice/insert")
public class NoticeInsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/admin/admin-notinsert.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
			
			String writerNo = req.getParameter("writerNo");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			AdminNoticeVo vo = new AdminNoticeVo();
			vo.setWriterNo(writerNo);
			vo.setTitle(title);
			vo.setContent(content);
			
			AdminNoticeService ans = new AdminNoticeService();
			int result = ans.insert(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/notice/list");
			}else {
				System.out.println("등록실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
}
