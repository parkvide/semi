package com.kh.app.admin.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.member.service.AdminMemberService;


@WebServlet("/admin/member")
public class AdminMemberController extends HttpServlet {

	private final AdminMemberService as;
	
	public AdminMemberController() {
		this.as = new AdminMemberService();
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		try {
//			
//			//데이터 꺼내오기
//			int listCount = as.getAdminCnt();
//			String x =req.getParameter("num") == null? "1" : req.getParameter("num");
//			int currentPage = Integer.parseInt(x);
//			int pageLimit = 5;
//			int memberLimit = 10;
//			
//			PageVo pvo = new PageVo(listCount, currentPage, pageLimit, memberLimit);
//			List<MemberVo>voList = ms.selectMemberList(pvo);
//			
//			req.setAttribute("voList", voList);
//			req.setAttribute("num", pvo);
//			req.getRequestDispatcher("/WEB-INF/views/admin/admin-member.jsp").forward(req, resp);
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();	
//		}
//		
//		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	
	}
}
