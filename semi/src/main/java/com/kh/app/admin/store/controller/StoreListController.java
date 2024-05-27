package com.kh.app.admin.store.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.store.service.AdminStoreService;
import com.kh.app.admin.store.vo.AdminStoreVo;

@WebServlet("/admin/store/list")
public class StoreListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	     try {
	            AdminStoreService ass = new AdminStoreService();
	            List<AdminStoreVo> storeList = ass.getAllProducts();
	            
	            req.setAttribute("storeList", storeList);
	            req.getRequestDispatcher("/WEB-INF/views/admin/admin-storelist.jsp").forward(req, resp);
	        } catch (Exception e) {
	            e.printStackTrace();
	            resp.sendRedirect("/error");
	        }
		
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
