package com.kh.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.board.service.MovieReviewService;
import com.kh.app.board.vo.ReviewVo;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/movie/review/write")
public class ReviewWriteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession session = req.getSession();
			String content = req.getParameter("content");
			String ticketingNo = req.getParameter("ticketingNo");
			String starRating = req.getParameter("starRating");
			ReviewVo reviewVo = new ReviewVo();
			reviewVo.setContent(content);
			reviewVo.setTicketingNo(ticketingNo);
			reviewVo.setStarRating(starRating);
			
			MovieReviewService mrs = new MovieReviewService();
			int result = mrs.writeReply(reviewVo);
			PrintWriter out = resp.getWriter();
			out.write("result : " + result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
