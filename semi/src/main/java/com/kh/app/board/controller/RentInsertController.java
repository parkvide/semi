package com.kh.app.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.RentVo;
import com.kh.app.cinema.service.CinemaService;
import com.kh.app.cinema.vo.CinemaVo;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/board/rent/insert")
public class RentInsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			CinemaService cs = new CinemaService();
			List<CinemaVo> voList = cs.cinemaList();
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/board/rentInsert.jsp").forward(req, resp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			
			String writerNo = loginMemberVo.getNo(); 
			String cinemaNo = req.getParameter("cinemaNo");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String rentalDate = req.getParameter("rentalDate");
			
			RentVo rentVo = new RentVo();
			rentVo.setWriterNo(writerNo);
			rentVo.setCinemaNo(cinemaNo);
			rentVo.setTitle(title);
			rentVo.setContent(content);
			rentVo.setRentalDate(rentalDate);
			
			BoardService bs = new BoardService();
			int result = bs.insertRent(rentVo);
			
			if(result != 1) {
				throw new Exception("게시글 작성 실패....");
			}
			resp.sendRedirect("/app/board/rentList");
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
}
