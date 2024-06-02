package com.kh.app.admin.movie.time.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.movie.time.service.AdminMovieTimeService;
import com.kh.app.admin.movie.time.vo.AdminMovieTimeVo;

@WebServlet("/admin/movie/time/list")
public class MovieTimeListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			
//			AdminMovieTimeService ams = new AdminMovieTimeService();
//			List<AdminMovieTimeVo>  AdminMovieTimevoList = ams.list();
//			
//			req.setAttribute("AdminMovieTimevoList", AdminMovieTimevoList );
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-movieTimeList.jsp").forward(req, resp);
		
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
	
}
