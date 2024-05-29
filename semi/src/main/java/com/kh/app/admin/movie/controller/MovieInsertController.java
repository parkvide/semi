package com.kh.app.admin.movie.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.kh.app.admin.movie.service.MovieService;
import com.kh.app.admin.movie.vo.MovieVo;

@MultipartConfig(
		maxFileSize = 1024*1024*10 ,
		maxRequestSize = 1024*1024*50 ,
		fileSizeThreshold = 1024*1024*10
)

@WebServlet("/admin/movie/insert")
public class MovieInsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/admin/admin-movieinsert.jsp").forward(req, resp);
	
	
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
			Part poster = req.getPart("post");
			
			String photo = ""; 
			if(poster.getSize() > 0) {
				// 파일을 서버에 저장하기
				String originFileName = poster.getSubmittedFileName();
				InputStream is = poster.getInputStream();
				
				String path = "D:\\dev\\servletWorkspace\\prj99semi\\src\\main\\webapp\\resources\\upload\\";
				String random = UUID.randomUUID().toString();
				String ext = originFileName.substring(originFileName.lastIndexOf("."));
				photo = System.currentTimeMillis() + "_" + random + ext;
				FileOutputStream fos = new FileOutputStream(path + photo);
				
				byte[] buf = new byte[1024];
				int size = 0;
				while( (size=is.read(buf)) != -1 ) {
					fos.write(buf , 0, size);
				}
				
				is.close();
				fos.close();
			}
			
			
			
			MovieVo vo = new MovieVo();
			vo.setType(type);
			vo.setMovie_age(age);
			vo.setSummary(summary);
			vo.setCast(cast);
			vo.setDirector(director);
			vo.setRunning_time(time);
			vo.setPoster(photo);
			
			MovieService ms = new MovieService();
			int result = ms.insert(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/movie/list");
			}else {
				//등록실패
			}
			
			
		} catch (Exception e) {
			//등록중 에러발생
		}
		
	}

}
