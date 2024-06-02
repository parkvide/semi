package com.kh.app.admin.movie.time.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.movie.time.service.AdminMovieTimeService;
import com.kh.app.admin.movie.time.vo.AdminMovieTimeVo;

@WebServlet("/admin/movie/time/insert")
public class MovieTimeInsertController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/admin/admin-movieTimeInsert.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			String screening = req.getParameter("sceening");
			
			 AdminMovieTimeVo vo = new AdminMovieTimeVo();
			 vo.setScreeningDate(screening);

			 AdminMovieTimeService ams = new AdminMovieTimeService();
			 int result = ams.insert();
			 
			 if(result == 1) {
				 resp.sendRedirect("/app/admin/movie/list");
			 }else {
				 System.out.println("등록실패");
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		
		
		}
		}
	
	
}
