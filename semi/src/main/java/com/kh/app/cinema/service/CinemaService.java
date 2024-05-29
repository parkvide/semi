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

}
