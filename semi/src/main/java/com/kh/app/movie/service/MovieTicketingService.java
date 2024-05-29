package com.kh.app.movie.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.movie.dao.MovieDao;
import com.kh.app.movie.vo.MovieVo;


public class MovieTicketingService {

	private final MovieDao dao;
	
	public MovieTicketingService() {
		this.dao = new MovieDao();
	}
	
	
	
	public List<MovieVo> selectMovieList() throws Exception {
		
		SqlSession ss = getSqlSession();
		
		List<MovieVo> voList = dao.selectMovieList(ss);
		
		ss.close();
		
		return voList;
	}


	//최우성 작성
	public List<MovieVo> selectMovieHome() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<MovieVo> voList = dao.selectMovieHome(ss);
		ss.close();
		
		return voList;
	}



	public List<MovieVo> selectMovieDetail(String no) throws Exception {
		SqlSession ss = getSqlSession();
		List<MovieVo> voList = dao.selectMovieDetail(ss, no);
		ss.close();
		
		return voList;
		
	}

}
