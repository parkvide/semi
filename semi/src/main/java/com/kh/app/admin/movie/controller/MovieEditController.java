package com.kh.app.admin.movie.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
	
			String no = req.getParameter("no");
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String type = req.getParameter("type");
			String age = req.getParameter("age");
			String summary = req.getParameter("summary");
			String cast = req.getParameter("cast");
			String director = req.getParameter("director");
			String time = req.getParameter("time");
			Part poster = req.getPart("poster");
			
			String poster2 = "";
			
			if(poster.getSize() > 0) {
				// 파일을 서버에 저장하기
				String originFileName = poster.getSubmittedFileName();
				InputStream is = poster.getInputStream();
				
				String path = "D:\\dev\\four's\\semi\\src\\main\\webapp\\resources\\img\\admin";
				String random = UUID.randomUUID().toString();
				String ext = originFileName.substring(originFileName.lastIndexOf("."));
				poster2 = System.currentTimeMillis() + "_" + random + ext;
				FileOutputStream fos = new FileOutputStream(path + poster2);
				
				byte[] buf = new byte[1024];
				int size = 0;
				while( (size=is.read(buf)) != -1 ) {
					fos.write(buf , 0, size);
				}
				
				is.close();
				fos.close();
			}
			
			AdminMovieVo vo = new AdminMovieVo();
			vo.setType(type);
			vo.setMovieAge(age);
			vo.setSummary(summary);
			vo.setCast(cast);
			vo.setDirector(director);
			vo.setRunningTime(time);
			vo.setPoster(poster2);
			
			AdminMovieService as = new AdminMovieService();
			int result = as.edit(vo);
			
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
