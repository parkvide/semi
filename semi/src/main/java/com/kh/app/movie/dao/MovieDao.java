package com.kh.app.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.movie.vo.MovieVo;


public class MovieDao {

	public List<MovieVo> selectMovieList(SqlSession ss) {
			
		 return ss.selectList("MovieMapper.selectMovieList");	 
		
	}

	//최우성 작성
	public List<MovieVo> selectMovieHome(SqlSession ss) {
		return ss.selectList("MovieMapper.selectMovieHome");
	}

	public List<MovieVo> selectMovieDetail(SqlSession ss, String no) {
		return ss.selectOne("MovieMapper.selectMovieDetail" ,no);
		
	}

}
