package com.kh.app.admin.store.controller;

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

import com.kh.app.admin.store.service.AdminStoreService;
import com.kh.app.admin.store.vo.AdminStoreVo;

@MultipartConfig(
		maxFileSize = 1024*1024*10 ,
		maxRequestSize = 1024*1024*50 ,
		fileSizeThreshold = 1024*1024*10
)

@WebServlet("/admin/store/insert")
public class StoreInsertController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/admin/admin-storeinsert.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			String category = req.getParameter("category");
			String name = req.getParameter("name");
			String price = req.getParameter("price");
			String origin = req.getParameter("origin");
			Part nutrientne = req.getPart("nutrientne");
			Part product = req.getPart("product");
			String detail = req.getParameter("detail");
			
			String product2 = "";
			if(product.getSize() > 0) {
				// 파일을 서버에 저장하기
				String originFileName = product.getSubmittedFileName();
				InputStream is = product.getInputStream();
				
				String path = "D:\\dev\\four's\\semi\\src\\main\\webapp\\resources\\img\\admin";
				String random = UUID.randomUUID().toString();
				String ext = originFileName.substring(originFileName.lastIndexOf("."));
				product2 = System.currentTimeMillis() + "_" + random + ext;
				FileOutputStream fos = new FileOutputStream(path + product2);
				
				byte[] buf = new byte[1024];
				int size = 0;
				while( (size=is.read(buf)) != -1 ) {
					fos.write(buf , 0, size);
				}
				
				is.close();
				fos.close();
			}
			
			String nutrientne2 = ""; 
			if(nutrientne.getSize() > 0) {
				// 파일을 서버에 저장하기
				String originFileName = nutrientne.getSubmittedFileName();
				InputStream is = nutrientne.getInputStream();
				
				String path = "D:\\dev\\four's\\semi\\src\\main\\webapp\\resources\\img\\admin";
				String random = UUID.randomUUID().toString();
				String ext = originFileName.substring(originFileName.lastIndexOf("."));
				nutrientne2 = System.currentTimeMillis() + "_" + random + ext;
				FileOutputStream fos = new FileOutputStream(path + nutrientne2);
				
				byte[] buf = new byte[1024];
				int size = 0;
				while( (size=is.read(buf)) != -1 ) {
					fos.write(buf , 0, size);
				}
				
				is.close();
				fos.close();
			}
			
			AdminStoreVo vo = new AdminStoreVo();
			vo.setName(name);
			vo.setCategoryNo(category);
			vo.setPrice(price);
			vo.setOriginCountry(origin);
			vo.setNutrienteImg(nutrientne2);
			vo.setProductImg(product2);
			vo.setDetail(detail);
			
			AdminStoreService ass = new AdminStoreService();
			int result = ass.insert(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/store/list");
				System.out.println("등록성공");
			}else {
				System.out.println("등록 실패");
			}
			
		} catch (Exception e) {
			System.out.println("등록하다 에러발생");
			e.printStackTrace();
		
		
		}
		
		
	
	}
	
	
}
