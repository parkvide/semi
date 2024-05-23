package com.kh.app.movie.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;
import com.kh.app.movie.dao.MovieDao;
import com.kh.app.movie.vo.MovieVo;


public class MovieTicketingService {

	private final MovieDao dao;
	
	public MovieTicketingService() {
		this.dao = new MovieDao();
	}
	
	
	
	public List<MovieVo> selectMovieList() throws Exception {
		
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		
		List<MovieVo> voList = dao.selectMovieList(ss);
		
		ss.close();
		
		return voList;
	}

}
