package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.FaqVo;

public class FaqDao {

	//Faq 조회
	public List<FaqVo> selectFaqList(SqlSession ss) {
		return ss.selectList("BoardMapper.selectFaqList");
	}

}
