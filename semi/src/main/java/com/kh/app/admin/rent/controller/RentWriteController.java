package com.kh.app.admin.rent.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.rent.service.AdminRentService;
import com.kh.app.admin.rent.vo.AdminRentVo;

@WebServlet("/admin/rent/writer")
public class RentWriteController  extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		try {
//			String no = req.getParameter("no");
//			
//			AdminRentService ars = new AdminRentService();
//			List<AdminRentVo> adminVoList = ars.selectLis
//			req.setAttribute("adminVoList", adminVoList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-rentWriter.jsp").forward(req, resp); // 주소 넣기
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String no = req.getParameter("no");
			String answerTitle = req.getParameter("answerTitle");
			String answerContent = req.getParameter("answerContent");
			
			AdminRentVo adminRentVo = new AdminRentVo();
			adminRentVo.setNo(no);
			adminRentVo.setAnswerTitle(answerTitle);
			adminRentVo.setAnswerContent(answerContent);
			
			AdminRentService ars = new AdminRentService();
			int result = ars.answerUpdate(adminRentVo);
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	
	
	}
	
}
