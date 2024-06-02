package com.kh.app.admin.movie.time.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.movie.time.vo.AdminMovieTimeVo;

public class AdminMovieTimeDao {

	public int insert(SqlSession ss) {
		return ss.insert("AdminMApper.movieTimeInsert");
	}

	public List<AdminMovieTimeVo> list(SqlSession ss) {
		return ss.selectList(null);
	}

}
