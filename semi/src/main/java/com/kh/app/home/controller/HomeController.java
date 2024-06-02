package com.kh.app.home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.EventVo;
import com.kh.app.cinema.service.CinemaService;
import com.kh.app.movie.service.MovieTicketingService;
import com.kh.app.movie.vo.MovieVo;
import com.kh.app.store.service.ProductService;
import com.kh.app.store.vo.ProductVo;

@WebServlet("/home")
public class HomeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			MovieTicketingService mts = new MovieTicketingService();
			BoardService bs = new BoardService();
			ProductService ps = new ProductService();
			
			
			
			List<MovieVo> movieImgList = mts.selectMovieHome();
			List<EventVo> eventImgList = bs.selectEventList();
			List<ProductVo> packList = ps.selectPackList();
			List<ProductVo> comboList = ps.selectComboList();
			List<ProductVo> gtList = ps.selectGiftTicket();
			
			req.setAttribute("movieImgList", movieImgList);
			req.setAttribute("eventImgList", eventImgList);
			req.setAttribute("packList", packList);
			req.setAttribute("comboList", comboList);
			req.setAttribute("gtList", gtList);
			
			req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
