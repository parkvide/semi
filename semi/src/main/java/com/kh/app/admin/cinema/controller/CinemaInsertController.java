package com.kh.app.admin.cinema.controller;

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

import com.kh.app.admin.cinema.service.AdminCinemaService;
import com.kh.app.admin.cinema.vo.AdminCinemaVo;

@WebServlet("/admin/cinema/insert")
public class CinemaInsertController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			
			String name = req.getParameter("name");
			String address = req.getParameter("address");
			String tel = req.getParameter("tel");
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
			
			AdminCinemaVo vo = new AdminCinemaVo();
			vo.setCinemaName(name);
			vo.setCinemaAddress(address);
			vo.setCinemaTel(tel);
			vo.setCinemaImg(img2);
			
			AdminCinemaService acs = new AdminCinemaService();
			int result = acs.insert(vo);
			
			if(result == 1) {
				System.out.println("등록성공");
			}else {
				System.out.println("등록실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
	}
}
