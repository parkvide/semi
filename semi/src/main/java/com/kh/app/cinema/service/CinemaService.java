package com.kh.app.cinema.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.cinema.dao.CinemaDao;
import com.kh.app.cinema.vo.CinemaVo;
import static com.kh.app.db.SqlSessionTemplate.*;

public class CinemaService {

	private final CinemaDao dao;
	
	public CinemaService() {
		this.dao = new CinemaDao();
	}
	public List<CinemaVo> cinemaList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<CinemaVo> voList = dao.cinemaList(ss);
		ss.close();
		return voList;
		
	}
	public CinemaVo getCinemaList(String no) throws Exception {
		
		SqlSession ss = getSqlSession();
		CinemaVo vo = dao.getCinemaList(ss, no);
		ss.close();
		return vo;
	}
	public List<CinemaVo> getCinemaName(String cinemaAddress) throws Exception {
		
		SqlSession ss = getSqlSession();
		List<CinemaVo> cinemaNameList = dao.getCinemaName(ss, cinemaAddress);
		ss.close();
		return cinemaNameList;
	}
	public CinemaVo getCinemaDetail(String cinemaName) throws Exception {
		
		SqlSession ss = getSqlSession();
		CinemaVo cinemaVo = dao.getCinemaDetail(ss,cinemaName);
		ss.close();
		return cinemaVo;
	}

}
