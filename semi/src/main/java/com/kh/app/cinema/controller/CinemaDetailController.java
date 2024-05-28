package com.kh.app.cinema.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.cinema.service.CinemaService;
import com.kh.app.cinema.vo.CinemaVo;

@WebServlet("/cinema")
public class CinemaDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			String no = req.getParameter("no");
			
			CinemaService cs = new CinemaService();
			CinemaVo vo = cs.getCinemaList(no);
			req.setAttribute("vo", vo);
			req.getRequestDispatcher("/WEB-INF/views/cinema/cinema.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
