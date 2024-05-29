package com.kh.app.admin.faq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.faq.service.AdminFaqService;
import com.kh.app.admin.faq.vo.AdminFaqVo;

@WebServlet("/admin/faq/insert")
public class FaqInsertController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
			int result = afs.insert(vo);
			
			if(result == 1) {
				System.out.println("등록성공");
			}else {
				System.out.println("등록실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}
	
	
	
}
