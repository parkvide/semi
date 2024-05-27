package com.kh.app.admin.event.dao;

import org.apache.ibatis.session.SqlSession;

public class AdminEventDao {

	public int insert(SqlSession ss, AdminEventVo vo) {
		return ss.insert("AdminMapper.eventInsert",vo);
	}

}
