package com.kh.app.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.FaqVo;

@WebServlet("/board/faqlist")
public class FaqListController extends HttpServlet{
	
	//게시물 조회
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			BoardService bs = new BoardService();
			List<FaqVo> voList = bs.selectFaqList();
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/board/faq.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
