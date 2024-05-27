package com.kh.app.admin.theater.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.theater.vo.AdminTheaterVo;

public class AdminTheaterDao {

	public int insert(SqlSession ss, AdminTheaterVo vo) {
		return ss.insert("AdminMapper.theaterInsert" , vo);
	}

}
