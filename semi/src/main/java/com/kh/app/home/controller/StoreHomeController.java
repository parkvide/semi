package com.kh.app.home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.store.service.ProductService;
import com.kh.app.store.vo.ProductVo;

@WebServlet("/store")
public class StoreHomeController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ProductService ps = new ProductService();
			List<ProductVo> packList = ps.selectPackList();
			List<ProductVo> comboList = ps.selectComboList();
			List<ProductVo> ticketList = ps.selectGiftTicket();
			
			req.setAttribute("packList", packList);
			req.setAttribute("comboList", comboList);
			req.setAttribute("ticketList", ticketList);
			req.getRequestDispatcher("/WEB-INF/views/store/storehome.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
