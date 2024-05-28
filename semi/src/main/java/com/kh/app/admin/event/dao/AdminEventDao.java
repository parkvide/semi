package com.kh.app.admin.event.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class AdminEventDao {

	public int insert(SqlSession ss, AdminEventVo vo) {
		return ss.insert("AdminMapper.eventInsert",vo);
	}

	public List<AdminEventVo> list(SqlSession ss) {
		 return ss.selectList("AdminMapper.eventList");
	}

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.eventDelete", no);
	}

}
