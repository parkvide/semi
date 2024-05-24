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

@WebServlet("/movie/list")
public class MovieController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
		MovieTicketingService mts = new MovieTicketingService();
		List<MovieVo> selectMovieHome = mts.selectMovieHome();
		req.setAttribute("selectMovieHome", selectMovieHome);
		req.getRequestDispatcher("/WEB-INF/views/movie/movieList.jsp").forward(req, resp);
		} catch (Exception e) {
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
