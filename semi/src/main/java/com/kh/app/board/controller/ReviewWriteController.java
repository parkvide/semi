package com.kh.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			String writerNo = loginMemberVo.getNo();
			String content = req.getParameter("content");
			String movieNo = req.getParameter("movieNo");
			
			ReviewVo reviewVo = new ReviewVo();
			reviewVo.setWriterNo(writerNo);
			reviewVo.setContent(content);
			reviewVo.setMovieNo(movieNo);
			
			MovieReviewService mrs = new MovieReviewService();
			int result = mrs.writeReply(reviewVo);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
