package com.kh.app.admin.theater.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.theater.vo.AdminTheaterVo;

public class AdminTheaterDao {

	public int insert(SqlSession ss, AdminTheaterVo vo) {
		return ss.insert("AdminMapper.theaterInsert" , vo);
	}

	public List<AdminTheaterVo> list(SqlSession ss) {
		 return ss.selectList("AdminMapper.theaterList");
	}

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.theaterDelete", no);
	}

	public int edit(SqlSession ss, AdminTheaterVo vo) {
		return ss.update("AdminMapper.theaterEdit", vo);
		//이거 맵퍼 설정할떄
		// parameterType="com.kh.app.admin.theater.vo.AdminTheaterVo"
		//파라미터 타입 까먹지마
	}


}
