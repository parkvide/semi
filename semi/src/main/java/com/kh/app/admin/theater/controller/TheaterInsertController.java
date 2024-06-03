package com.kh.app.admin.theater.controller;

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

import com.kh.app.admin.theater.service.AdminTheaterService;
import com.kh.app.admin.theater.vo.AdminTheaterVo;


@MultipartConfig(
		maxFileSize = 1024*1024*10 ,
		maxRequestSize = 1024*1024*50 ,
		fileSizeThreshold = 1024*1024*10
)

@WebServlet("/admin/theater/insert")
public class TheaterInsertController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	req.getRequestDispatcher("/WEB-INF/views/admin/admin-theaterinster.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String type = req.getParameter("type");
			Part img = req.getPart("img");
			
			String img2 = ""; 
			if(img.getSize() > 0) {
				// 파일을 서버에 저장하기
				String originFileName = img.getSubmittedFileName();
				InputStream is = img.getInputStream();
				
				String path = "D:\\dev\\four's\\semi\\src\\main\\webapp\\resources\\img\\admin";
				String random = UUID.randomUUID().toString();
				String ext = originFileName.substring(originFileName.lastIndexOf("."));
				img2 = System.currentTimeMillis() + "_" + random + ext;
				FileOutputStream fos = new FileOutputStream(path + img2);
				
				byte[] buf = new byte[1024];
				int size = 0;
				while( (size=is.read(buf)) != -1 ) {
					fos.write(buf , 0, size);
				}
				
				is.close();
				fos.close();
			}
			
			AdminTheaterVo vo = new AdminTheaterVo();
			vo.setType(type);
			vo.setTheaterImg(img2);

			AdminTheaterService ats = new AdminTheaterService();
			int result = ats.insert(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/theater/list");
			}else {
				System.out.println("등록실패");
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
}
