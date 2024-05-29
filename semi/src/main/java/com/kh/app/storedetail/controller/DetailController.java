package com.kh.app.storedetail.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.store.service.ProductService;
import com.kh.app.store.vo.ProductVo;

@WebServlet("/store/detail")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String no = req.getParameter("no");
			
			ProductService ps = new ProductService();
			ProductVo vo = ps.getPrdByNo(no);
			
			if(vo == null) {
				throw new Exception("상품조회 실패...");
			}
			req.setAttribute("vo", vo);
			req.getRequestDispatcher("/WEB-INF/views/store/detail.jsp").forward(req, resp);

		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
