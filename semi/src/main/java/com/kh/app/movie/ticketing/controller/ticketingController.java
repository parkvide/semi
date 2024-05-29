package com.kh.app.movie.ticketing.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.cinema.vo.CinemaVo;
import com.kh.app.movie.service.MovieTicketingService;
import com.kh.app.movie.vo.MovieVo;
import com.kh.app.screeninfo.vo.ScreenInfoVo;


@WebServlet("/movie/ticketing")
public class ticketingController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	MovieTicketingService mts = new MovieTicketingService();
	
	try {
		List<MovieVo> voList = mts.selectMovieList();
		List<CinemaVo> ScreenList = mts.selectCinemaList();
		req.setAttribute("voList", voList);
		req.setAttribute("ScreenList", ScreenList);
		req.getRequestDispatcher("/WEB-INF/views/movie/ticketing.jsp").forward(req, resp);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
