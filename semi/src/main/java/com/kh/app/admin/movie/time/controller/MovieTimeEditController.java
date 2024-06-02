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

@WebServlet("/admin/movie/time/edit")
public class MovieTimeEditController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String no = req.getParameter("no");
			
			AdminMovieTimeService ars = new AdminMovieTimeService();
			List<AdminMovieTimeVo> adminVoList = ars.edit(no);
			req.setAttribute("adminVoList", adminVoList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-adminMovieTimeEdit.jsp").forward(req, resp); // 주소 넣기
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	

	

}
