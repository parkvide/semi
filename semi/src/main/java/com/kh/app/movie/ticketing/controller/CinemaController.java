package com.kh.app.movie.ticketing.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.kh.app.screeninfo.vo.ScreenInfoVo;
import com.kh.app.theater.vo.TheaterVo;

@WebServlet("/cinemas")
public class CinemaController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// service에서 lsit
	MovieTicketingService mts = new MovieTicketingService();
	try {
		List<CinemaVo> screenList = mts.selectCinemaList();
		List<TheaterVo> theaterList = mts.selectTheaterList();
		List<ScreenInfoVo> dateList = mts.selectDateList();
		
		Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("cinemas", screenList);
        responseMap.put("theaters", theaterList);
        responseMap.put("times", dateList);
		
		Gson gson = new Gson();
		String jsonResponse = gson.toJson(responseMap);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		System.out.println("jsonResponse: " + jsonResponse);
		
		PrintWriter out = resp.getWriter();
        out.write(jsonResponse);
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
