package com.kh.app.movie.ticketing.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.kh.app.cinema.vo.CinemaVo;
import com.kh.app.movie.service.MovieTicketingService;
import com.kh.app.theater.vo.TheaterVo;

@WebServlet("/cinemas")
public class CinemaController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// service에서 lsit
	MovieTicketingService mts = new MovieTicketingService();
	try {
		List<CinemaVo> screenList = mts.selectCinemaList();
		// Gson 라이브러리 \로 리스트를 json 형태로 바꿈
		List<TheaterVo> theaterList = mts.selectTheaterList();
		Gson gson = new Gson();
    
		String json1 = gson.toJson(screenList);
		String json2 = gson.toJson(theaterList);
		
		PrintWriter out = resp.getWriter();
		System.out.println("json : " + json1);
         out.write(json1);
         out.write(json2);
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
