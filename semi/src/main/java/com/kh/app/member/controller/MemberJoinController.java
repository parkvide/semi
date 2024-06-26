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

@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			HttpSession session = req.getSession();
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String pwd2 = req.getParameter("pwd2");
			String name = req.getParameter("name");
			String birth = req.getParameter("birth");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			

			MemberVo vo = new MemberVo();
			
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setPwd2(pwd2);
			vo.setName(name);
			vo.setBirth(birth);
			vo.setEmail(email);
			vo.setPhone(phone);
			

			MemberService ms = new MemberService();

			int result = ms.join(vo);
			if (result == 1) {
				req.setAttribute("resultMsg", "회원가입 성공");
			} else {
				req.setAttribute("resultMsg", "회원가입 실패");
			}
			resp.sendRedirect("/app/member/login");
			
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}

	}
}
