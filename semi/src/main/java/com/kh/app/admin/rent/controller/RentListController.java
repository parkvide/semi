package com.kh.app.admin.rent.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.rent.service.AdminRentService;
import com.kh.app.admin.rent.vo.AdminRentVo;

@WebServlet("/admin/rent/list")
public class RentListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			AdminRentService ars = new AdminRentService();
			List<AdminRentVo> AdminRentVoList = ars.list();
			
			req.setAttribute("AdminRentVoList", AdminRentVoList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-rentList.jsp").forward(req, resp);
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	
}
