package com.kh.app.home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.NoticeVo;

@WebServlet("/board/home")
public class BoardHomeController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			BoardService bs = new BoardService();
			List<NoticeVo> noticeList = bs.getNoticeList();
			req.setAttribute("noticeList", noticeList);
			req.getRequestDispatcher("/WEB-INF/views/board/boardHome.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
