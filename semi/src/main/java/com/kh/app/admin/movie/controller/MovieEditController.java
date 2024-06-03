package com.kh.app.admin.movie.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.kh.app.admin.movie.service.AdminMovieService;
import com.kh.app.admin.movie.vo.AdminMovieVo;

@WebServlet("/admin/movie/edit")
public class MovieEditController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			String no = req.getParameter("no");
			
			AdminMovieService ams = new AdminMovieService();
			AdminMovieVo adminMovieList = (AdminMovieVo)ams.selectOne(no);
			req.setAttribute("adminMovieList", adminMovieList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-movieEdit.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String no = req.getParameter("no");
			String summary = req.getParameter("summary");

		
			
			AdminMovieVo vo = new AdminMovieVo();
			vo.setNo(no);
			vo.setSummary(summary);
			
			AdminMovieService as = new AdminMovieService();
			int result = as.edit(vo);
			System.out.println("result : " + result);
			if(result == 1) {
				resp.sendRedirect("/app/admin/movie/list");
				System.out.println("등록성공");
			}else {
				System.out.println("등록실팬");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	
	}
	
}
