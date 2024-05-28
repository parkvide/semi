package com.kh.app.admin.event.controller;

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

import com.kh.app.admin.event.service.AdminEventService;
import com.kh.app.admin.event.vo.AdminEventVo;

@WebServlet("/admin/evt/edit")
public class EventEditController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			
			String writerNo = req.getParameter("writerNo");
			String title = req.getParameter("title");
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
			
			AdminEventVo vo = new AdminEventVo();
			vo.setWriterNo(writerNo);
			vo.setTitle(title);
			vo.setContentImg(img2);
			
			AdminEventService aes = new AdminEventService();
			int result = aes.edit(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/evt/list");
			}else {
				System.out.println("수정실팽");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	

}
