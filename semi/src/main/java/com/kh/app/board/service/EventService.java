package com.kh.app.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.EventDao;
import com.kh.app.board.vo.EventVo;
import com.kh.app.db.SqlSessionTemplate;

public class EventService {

	private final EventDao dao;
	
	public EventService() {
		this.dao = new EventDao();
	}
	
	public List<EventVo> selectEventList() throws Exception {
		
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		List<EventVo> voList = dao.selectEventList(ss);
		
		ss.close();
		
		return voList;
		
	}

}
