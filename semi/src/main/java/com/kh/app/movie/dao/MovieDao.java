package com.kh.app.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.cinema.vo.CinemaVo;
import com.kh.app.movie.ticketing.vo.TicketingVo;
import com.kh.app.movie.vo.MovieVo;
import com.kh.app.screeninfo.vo.ScreenInfoVo;
import com.kh.app.theater.vo.TheaterVo;


public class MovieDao {

	public List<MovieVo> selectMovieList(SqlSession ss) {
			
		 return ss.selectList("MovieMapper.selectMovieList");	 
		
	}

	//최우성 작성
	public List<MovieVo> selectMovieHome(SqlSession ss) {
		return ss.selectList("MovieMapper.selectMovieHome");
	}

	public MovieVo selectMovieDetail(SqlSession ss, String no) {
		return ss.selectOne("MovieMapper.selectMovieDetail" ,no);
		
	}
	//박진동
	public List<CinemaVo> selectCinemaList(SqlSession ss) {
		return ss.selectList("CinemaMapper.selectCinemaList");
	}

	public List<TheaterVo> selectTheaterList(SqlSession ss) {
		return ss.selectList("CinemaMapper.selectTheaterList");
	}

	public List<ScreenInfoVo> selectDateList(SqlSession ss) {
		return ss.selectList("CinemaMapper.selectDateList");
	}

	public int insertTicket(SqlSession ss, TicketingVo vo) {
		return ss.insert("TicketMapper.insertTicket");
	}

	public List<TicketingVo> selectTicketInfoList(SqlSession ss) {
		return ss.selectList("TicketMapper.selectTicket");
	}

}
