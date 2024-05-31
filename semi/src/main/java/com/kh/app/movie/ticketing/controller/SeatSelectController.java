package com.kh.app.movie.ticketing.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.movie.service.MovieTicketingService;
import com.kh.app.movie.ticketing.vo.TicketingVo;

@WebServlet("/movie/seat")
public class SeatSelectController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 로컬 스토리지에서 필요한 값들을 가져옵니다.
        
        
        // 서비스를 통해 티켓을 예약하고 결과를 받습니다.
        try {
        	String buyerNo = req.getParameter("buyerNo");
            String theaterNo = req.getParameter("theaterNo");
            String screenInfo = req.getParameter("screenInfo");
            String seat = req.getParameter("seat");
            String headcount = req.getParameter("headcount");
            String reservationDate = req.getParameter("reservationDate");
            String price = req.getParameter("price");
            TicketingVo vo = new TicketingVo();
            vo.setBuyerNo(buyerNo);
            vo.setHeadcount(headcount);
            vo.setNo(theaterNo);
            vo.setPrice(price);
            vo.setReservationDate(reservationDate);
            vo.setScreenInfo(screenInfo);
            vo.setSeat(seat);
            vo.setTheaterNo(theaterNo);
            MovieTicketingService mts = new MovieTicketingService();
			int result = mts.insertTicket(vo);
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
      
		
		req.getRequestDispatcher("/WEB-INF/views/movie/seatSelect.jsp").forward(req, resp);
		
	}
}
