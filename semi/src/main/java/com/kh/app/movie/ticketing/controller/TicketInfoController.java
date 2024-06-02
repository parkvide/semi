package com.kh.app.movie.ticketing.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.movie.service.MovieTicketingService;
import com.kh.app.movie.ticketing.vo.TicketingVo;


@WebServlet("/movie/ticketinfo")
public class TicketInfoController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			MovieTicketingService mts = new MovieTicketingService();
			List<TicketingVo> voList = mts.selecTicketInfoList();
			System.out.println(voList);
			req.setAttribute("voList", voList);
			
			req.getRequestDispatcher("/WEB-INF/views/movie/ticketInfo.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
