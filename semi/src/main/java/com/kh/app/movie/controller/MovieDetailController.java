package com.kh.app.movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.movie.service.MovieTicketingService;
import com.kh.app.movie.vo.MovieVo;

@WebServlet("/movie/detail")
public class MovieDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String no = req.getParameter("no");
			MovieTicketingService mts = new MovieTicketingService();
			List<MovieVo> voList = mts.selectMovieDetail(no);
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/movie/movieDetail.jsp").forward(req, resp);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		req.getRequestDispatcher("/WEB-INF/views/movie/movieDetail.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
}
