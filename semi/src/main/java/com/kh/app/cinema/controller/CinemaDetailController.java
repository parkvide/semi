package com.kh.app.cinema.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.cinema.service.CinemaService;
import com.kh.app.cinema.vo.CinemaVo;

@WebServlet("/cinema/detail")
public class CinemaDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			 String cinemaAddress = req.getParameter("cinemaAddress");
			 CinemaService cs = new CinemaService();
			 List<CinemaVo> cinemaNameList = cs.getCinemaName(cinemaAddress);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String cinemaName = req.getParameter("cinemaName");
			CinemaService cs = new CinemaService();
			CinemaVo CinemaVo = cs.getCinemaDetail(cinemaName);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
