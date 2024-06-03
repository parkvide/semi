package com.kh.app.admin.event.controller;

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

import com.kh.app.admin.event.service.AdminEventService;
import com.kh.app.admin.event.vo.AdminEventVo;

@WebServlet("/admin/evt/edit")
public class EventEditController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String no = req.getParameter("no");
			
			AdminEventService aes = new AdminEventService();
			AdminEventVo adminEvtList = (AdminEventVo)aes.selectOne(no);
			req.setAttribute("adminEvtList", adminEvtList);
			req.getRequestDispatcher("/WEB-INF/views/admin/admin-evtEdit.jsp").forward(req, resp);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			
			String no = req.getParameter("no");
			String title = req.getParameter("title");
			
			AdminEventVo vo = new AdminEventVo();
			vo.setNo(no);
			vo.setTitle(title);
			
			AdminEventService aes = new AdminEventService();
			int result = aes.edit(vo);
			
			if(result == 1) {
				resp.sendRedirect("/app/admin/evt/list");
			}else {
				System.out.println("수정실팽");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	

}
