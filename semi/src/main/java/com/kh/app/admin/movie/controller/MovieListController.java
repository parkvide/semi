package com.kh.app.admin.movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.movie.service.AdminMovieService;
import com.kh.app.admin.movie.vo.AdminMovieVo;

@WebServlet("/admin/movie/list")
public class MovieListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			AdminMovieService ams = new AdminMovieService();
			List<AdminMovieVo> adminMovieVoList = ams.list();
			
			req.setAttribute("adminMovieVoList", adminMovieVoList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-movielist.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
