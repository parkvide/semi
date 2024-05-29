package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.EventVo;

public class EventDao {

	public List<EventVo> selectEventList(SqlSession ss) {
		
		return ss.selectList("BoardMapper.selectEventList");
		
	}

}
