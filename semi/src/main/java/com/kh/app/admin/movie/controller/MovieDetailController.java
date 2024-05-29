package com.kh.app.admin.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.movie.service.MovieService;
import com.kh.app.admin.vo.AdminVo;

@WebServlet("/admin/movie/detail")
public class MovieDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			
			
			String no = req.getParameter("no");
			String writerNo = req.getParameter("writerNo");
			if(no == null || no.length() == 0) {
				throw new Exception("조회할 게시글 번호를 입력하세요");
			}
			
			MovieService ms = new MovieService();
			AdminVo loginAdminVo =(AdminVo)req.getSession().getAttribute("loginAdminVo");
			boolean isSelf = loginAdminVo == null ? false : loginAdminVo.getNo().equals(writerNo);
			AdminVo vo = ms.getMovieByNo(no, isSelf);
			
			if(loginAdminVo == null) {
				throw new Exception("게시글 조회 실패");
			}
			
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-moviedetail").forward(req, resp);
			
			
		} catch (Exception e) {

			//게시물 조회하다 오류발생
		
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
