package com.kh.app.admin.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.movie.vo.MovieVo;
import com.kh.app.admin.movie.vo.PageVo;

public class MovieDao {

	public int insert(SqlSession ss, MovieVo vo) {
		
		ss.insert("AdminMapper.movieInsert" ,vo);
		
		return 0;
	}
	
	public int edit(SqlSession ss ,MovieVo vo) {
		
		ss.update("AdminMapper.movieEdit" ,vo);
		
		return 0;
		
	}

	public int getMovieCnt(SqlSession ss) {

		ss.selectOne("AdminMapper.movieCnt",ss);
		
		return 0;
	
	}

	public List<MovieVo> selectMovieList(SqlSession ss, PageVo pvo) {
		
		ss.selectList("AdminMapper.movieSelect", ss);
		
		return null;
	}

	public int increaseHit(SqlSession ss, String no) {

		ss.update("AdminMapper.movieIncreaseHit" , ss);
		
		return 0;
	}

	public MovieVo getMovieByNo(SqlSession ss, String no) {
		
		ss.selectOne("AdminMapper.moviebyno", ss);
		
		return null;
		
		
	}
	

	

}
