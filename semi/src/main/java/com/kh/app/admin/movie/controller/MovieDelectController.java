package com.kh.app.admin.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.movie.service.AdminMovieService;

@WebServlet("/admin/movie/delete")
public class MovieDelectController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String no = req.getParameter("no");
			AdminMovieService ams = new AdminMovieService();
			int result = ams.delete(no);
			if(result == 1) {
				resp.sendRedirect("/app/admin/movie/list");
			} else {
			}
		} catch (Exception e) {
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
