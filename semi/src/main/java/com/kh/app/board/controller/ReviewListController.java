package com.kh.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.MovieReviewService;
import com.kh.app.board.vo.ReviewVo;

@WebServlet("/movie/review/list")
public class ReviewListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String movieNo = req.getParameter("movieNo");
			MovieReviewService mrs = new MovieReviewService();
			List<ReviewVo> reviewVoList = mrs.selectReviewByMovieNo(movieNo);
			
			 Gson gson = new Gson();
	         String str = gson.toJson(reviewVoList);
	         
	         resp.setContentType("text/html; charset=UTF-8");// 한글처리 컨트롤러에서 나갈때 생기는 판단.
	         PrintWriter out = resp.getWriter();
	         out.write(str);
	         
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
