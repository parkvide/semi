package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.RentVo;

public class RentDao {

	public List<RentVo> selectRentList(SqlSession ss) {
		return ss.selectList("BoardMapper.selectRentList");
	}

}
