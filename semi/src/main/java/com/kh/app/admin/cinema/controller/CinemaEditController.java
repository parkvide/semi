package com.kh.app.admin.cinema.controller;

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

import com.kh.app.admin.cinema.service.AdminCinemaService;
import com.kh.app.admin.cinema.vo.AdminCinemaVo;

@WebServlet("/admin/cinema/edit")
public class CinemaEditController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			String no = req.getParameter("no");
			
			AdminCinemaService acs = new AdminCinemaService();
			AdminCinemaVo adminCinemaVo = (AdminCinemaVo)acs.selectOne(no);
			System.out.println(adminCinemaVo);
			req.setAttribute("adminCinemaVo", adminCinemaVo);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-cinemaEdit.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String no = req.getParameter("no");
			String name = req.getParameter("name");
			
			
			AdminCinemaVo vo = new AdminCinemaVo();
			vo.setCinemaName(name);
			vo.setNo(no);
			
			AdminCinemaService acs = new AdminCinemaService();
			int result = acs.edit(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/cinema/list");
			}else {
				System.out.println("등록실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
