package com.kh.app.admin.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.movie.vo.AdminMovieVo;

public class AdminMovieDao {

	public int insert(SqlSession ss, AdminMovieVo vo) {
		return ss.insert("AdminMapper.movieInsert" , vo);
	}

	public List<AdminMovieVo> list(SqlSession ss) {
		return ss.selectList("AdminMapper.movieList");
	}

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.movieDelete", no);
	}

	public int edit(SqlSession ss, AdminMovieVo vo) {
		return ss.update("AdminMapper.movieEdit" , vo);
	}

}
