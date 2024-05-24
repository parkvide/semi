package com.kh.app.admin.movie.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.movie.vo.AdminMovieVo;

public class AdminMovieDao {

	public int insert(SqlSession ss, AdminMovieVo vo) {

		ss.insert("AdminMapper.movieInsert", vo);

		return 0;
	}

}
