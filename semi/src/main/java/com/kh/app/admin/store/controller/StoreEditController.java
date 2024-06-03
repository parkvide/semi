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
@WebServlet("/admin/store/edit")
public class StoreEditController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
				
				String no = req.getParameter("no");
				
				AdminStoreService ass = new AdminStoreService();
				AdminStoreVo adminStoreList = (AdminStoreVo)ass.selectOne(no);
				req.setAttribute("adminStoreList", adminStoreList);
				req.getRequestDispatcher("/WEB-INF/views/admin/admin-storeEdit.jsp").forward(req, resp);
				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			String no =req.getParameter("no");
			String price = req.getParameter("price");
			
			
			
			AdminStoreVo vo = new AdminStoreVo();
			vo.setNo(no);
			vo.setPrice(price);
			
			AdminStoreService ass = new AdminStoreService();
			int result = ass.edit(vo);
			if(result == 1) {
				resp.sendRedirect("/app/admin/store/list");
			}else {
				System.out.println("게시글 수정 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
