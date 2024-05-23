package com.kh.app.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.movie.vo.MovieVo;


public class MovieDao {

	public List<MovieVo> selectMovieList(SqlSession ss) {
		
		return ss.selectList("MovieMapper.selectMovieList");	 
		
	}

}
