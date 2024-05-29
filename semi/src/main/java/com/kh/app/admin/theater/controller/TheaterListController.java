package com.kh.app.admin.theater.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.admin.theater.service.AdminTheaterService;
import com.kh.app.admin.theater.vo.AdminTheaterVo;

@WebServlet("/admin/theater/list")
public class TheaterListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	     try {
	            AdminTheaterService ats = new AdminTheaterService();
	            List<AdminTheaterVo> admintheaterVoList = ats.list();
	            
	            req.setAttribute("admintheaterVoList", admintheaterVoList);
	            req.getRequestDispatcher("/WEB-INF/views/admin/admin-theaterlist.jsp").forward(req, resp);
	        } catch (Exception e) {
	            e.printStackTrace();
	            resp.sendRedirect("/error");
	        }
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
