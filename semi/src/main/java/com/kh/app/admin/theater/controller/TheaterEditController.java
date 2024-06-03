package com.kh.app.admin.theater.controller;

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

import com.kh.app.admin.theater.service.AdminTheaterService;
import com.kh.app.admin.theater.vo.AdminTheaterVo;

@WebServlet("/admin/theater/edit")
public class TheaterEditController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String no = req.getParameter("no");
				
			AdminTheaterService ats = new AdminTheaterService();
			AdminTheaterVo adminTheaterList =(AdminTheaterVo)ats.selectOne(no);
			req.setAttribute("adminTheaterList", adminTheaterList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-theaterEdit.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String no = req.getParameter("no");
			String type = req.getParameter("type");
		
			AdminTheaterVo vo = new AdminTheaterVo();
			vo.setNo(no);
			vo.setType(type);
	
			AdminTheaterService ats = new AdminTheaterService(); 
			int result = ats.edit(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/theater/list");
			} else {
				resp.sendRedirect("/admin/theater/edit?error=fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("/admin/theater/edit?error=exception");
		}
	
	}
	

}
