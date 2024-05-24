package com.kh.app.store.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.store.service.ProductService;
import com.kh.app.store.vo.ProductVo;

@WebServlet("/store/popcorn")
public class PopcornStoreController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ProductService ps = new ProductService();
			List<ProductVo> voList = ps.selectPopList();
			
			req.setAttribute("voList", voList);
			req.getRequestDispatcher("/WEB-INF/views/store/popcorn.jsp").forward(req, resp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// 여기서req 죽음...
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doGet(req, resp);
	}
}
