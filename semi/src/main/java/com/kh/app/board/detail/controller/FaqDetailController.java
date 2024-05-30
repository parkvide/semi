package com.kh.app.board.detail.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.FaqVo;

@WebServlet("/board/faq/detail")
public class FaqDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String no = req.getParameter("no");
			
			BoardService bs = new BoardService();
			FaqVo faqVo = bs.selectFaqListByNo(no);
			
			req.setAttribute("faqVo", faqVo);
			req.getRequestDispatcher("/WEB-INF/views/board/detail/faqDetail.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
