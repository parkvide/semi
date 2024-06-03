package com.kh.app.cinema.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.app.cinema.service.CinemaService;
import com.kh.app.cinema.vo.CinemaVo;

@WebServlet("/cinema/detail")
public class CinemaDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			 String cinemaLocation = req.getParameter("cinemaLocation");
			 System.out.println("cinemaAddress" + cinemaLocation);
			 CinemaService cs = new CinemaService();
			 List<CinemaVo> cinemaNameList = cs.getCinemaName(cinemaLocation);
			 
			 Gson gson = new Gson();
			 String str = gson.toJson(cinemaNameList);
			 System.out.println("cinemaNameList : " + cinemaNameList);
			 resp.setContentType("text/html; charset=UTF-8");
			 PrintWriter out = resp.getWriter();
			 out.write(str);
			 
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String cinemaName = req.getParameter("cinemaName");
			System.out.println(cinemaName);
			CinemaService cs = new CinemaService();
			CinemaVo CinemaVo = cs.getCinemaDetail(cinemaName);
			
			Gson gson = new Gson();
			 String str = gson.toJson(CinemaVo);
			 
			 resp.setContentType("text/html; charset=UTF-8");
			 PrintWriter out = resp.getWriter();
			 out.write(str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
