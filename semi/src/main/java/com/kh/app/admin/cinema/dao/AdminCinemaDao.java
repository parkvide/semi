package com.kh.app.admin.cinema.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.cinema.vo.AdminCinemaVo;

public class AdminCinemaDao {

	public int insert(SqlSession ss , AdminCinemaVo vo) {
		return ss.insert("AdminMaper.cinemaInsert" , vo);
	}

}
