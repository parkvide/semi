package com.kh.app.admin.faq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.faq.service.AdminFaqService;
import com.kh.app.admin.faq.vo.AdminFaqVo;

@WebServlet("/admin/faq/edit")
public class FaqEditController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			String writerNo = req.getParameter("writerNo");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			
			 AdminFaqVo vo = new AdminFaqVo();
			 vo.setWriterNo(writerNo);
			 vo.setTitle(title);
			 vo.setContent(content);
			 
			 AdminFaqService afs = new AdminFaqService();
			 int result = afs.edit(vo);
			 
			 if(result == 1) {
				 resp.sendRedirect("/app/admin/faq/list");
			 }else {
				 System.out.println("수정실패");
			 }
	
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}
	
	
}
