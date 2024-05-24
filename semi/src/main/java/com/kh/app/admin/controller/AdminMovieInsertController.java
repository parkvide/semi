package com.kh.app.admin.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.kh.app.admin.movie.service.AdminMovieService;
import com.kh.app.admin.movie.vo.AdminMovieVo;

@MultipartConfig(maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50, fileSizeThreshold = 1024 * 1024 * 10

)

@WebServlet("/admin/movie/insert")
public class AdminMovieInsertController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/admin/admin-movieinsert.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String type = req.getParameter("type");
			String age = req.getParameter("age");
			String sumry = req.getParameter("sumry");
			String cast = req.getParameter("cast");
			String time = req.getParameter("time");
			Part img = req.getPart("img");

			String poster = "";
			if (img.getSize() > 0) {
				String originFileName = img.getSubmittedFileName();
				InputStream is = img.getInputStream();

				String path = "D:\\dev\\four's\\semi\\src\\main\\webapp\\resources\\upload\\";
				String random = UUID.randomUUID().toString();
				String ext = originFileName.substring(originFileName.lastIndexOf("."));
				poster = System.currentTimeMillis() + "_" + random + ext;
				FileOutputStream fos = new FileOutputStream(path + poster);

				byte[] buf = new byte[1024];
				int size = 0;
				while ((size = is.read(buf)) != -1) {
					fos.write(buf, 0, size);
				}

				is.close();
				fos.close();
			}

			AdminMovieVo amv = new AdminMovieVo();
			amv.setType(type);
			amv.setMovie_age(age);
			amv.setSummary(sumry);
			amv.setCast(cast);
			amv.setRunning_time(time);
			amv.setPoster(poster);

			AdminMovieService ams = new AdminMovieService();
			int result = ams.insert(amv);

			if (result == 1) {
				System.out.println("인설트 성공");
			} else {
				System.out.println("인설트 실패");
			}
			resp.sendRedirect("/app/admin/movie/list");

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
