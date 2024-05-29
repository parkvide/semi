package com.kh.app.admin.movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.movie.service.MovieService;
import com.kh.app.admin.movie.vo.MovieVo;
import com.kh.app.admin.movie.vo.PageVo;

@WebServlet("/admin/movie/list")
public class MovieListController extends HttpServlet {
	
	private MovieService ms;
	
	public MovieListController() {
		this.ms = new MovieService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		try {

			int listCount = ms.getMovieCnt();
			String x = req.getParameter("pno") == null ? "1" : req.getParameter("pno");
			int currentPage = Integer.parseInt(x);
			int pageLimit = 5;
			int movieLimit = 10;
			PageVo pvo = new PageVo(listCount, currentPage, pageLimit, movieLimit);
			
			List<MovieVo> voList = ms.selectMovieList(pvo);
			
			
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-movielist.jsp").forward(req, resp);
			
			
		} catch (Exception e) {
			//무비리스트 수정중 에러발생
		}
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
