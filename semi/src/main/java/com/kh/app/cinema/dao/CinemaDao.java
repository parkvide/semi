package com.kh.app.cinema.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.cinema.vo.CinemaVo;

public class CinemaDao {

	public List<CinemaVo> cinemaList(SqlSession ss) {
		return ss.selectList("CinemaMapper.cinemaList");

	}

	public CinemaVo getCinemaList(SqlSession ss, String no) {
		return ss.selectOne("CinemaMapper.getCinemaList",no);
	}

	public List<CinemaVo> getCinemaName(SqlSession ss, String cinemaLocation) {
		return ss.selectList("CinemaMapper.getCinemaName", cinemaLocation);
		
	}

	public CinemaVo getCinemaDetail(SqlSession ss, String cinemaName) {
		return ss.selectOne("CinemaMapper.getCinemaDetail",cinemaName);
	}


}
