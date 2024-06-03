package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/editHome")
public class MemberAllEditController extends HttpServlet{
	
	//회원정보 수정(마이페이지)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
		String id = loginMemberVo.getId();
		String email = loginMemberVo.getEmail();
		String phone = loginMemberVo.getPhone();
		
		session.setAttribute("id", id);
		session.setAttribute("email", email);
		session.setAttribute("phone", phone);
		req.getRequestDispatcher("/WEB-INF/views/edit/editHome.jsp").forward(req, resp);
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			String no = loginMemberVo.getNo();
			String pwd = req.getParameter("pwd");
			String pwd2 = req.getParameter("pwd2");

			
			MemberVo vo = new MemberVo();
			vo.setNo(no);
			vo.setPwd(pwd);
			vo.setPwd2(pwd2);

			
			MemberService ms = new MemberService();
			int result = ms.pwdEdit(vo);
			 
			if(result != 1) {
				throw new Exception("회원정보 수정 실패..");
			}
			session.setAttribute("alertMsg", "회원정보 수정 성공");
			session.removeAttribute("loginMemberVo");
			resp.sendRedirect("/app/home");
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}

}

