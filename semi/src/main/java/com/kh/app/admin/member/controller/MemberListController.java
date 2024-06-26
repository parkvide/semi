package com.kh.app.admin.member.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.member.service.AdminMemberService;
import com.kh.app.admin.member.vo.AdminMemberVo;

@WebServlet("/admin/member/list")
public class MemberListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			AdminMemberService ams = new AdminMemberService();
			List<AdminMemberVo> adminMemberVo = ams.list();
			
			req.setAttribute("adminMemberVo", adminMemberVo);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-memberList.jsp").forward(req, resp);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	
}
