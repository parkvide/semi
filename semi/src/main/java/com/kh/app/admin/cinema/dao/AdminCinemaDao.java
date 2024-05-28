package com.kh.app.admin.cinema.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.cinema.vo.AdminCinemaVo;

public class AdminCinemaDao {

	public int insert(SqlSession ss , AdminCinemaVo vo) {
		return ss.insert("AdminMaper.cinemaInsert" , vo);
	}

	public List<AdminCinemaVo> list(SqlSession ss) {
		return ss.selectList("AdminMapper.cinemaList");
	}

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.cinemaDelete", no);
	}

}
