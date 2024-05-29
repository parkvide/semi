package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.NoticeVo;

public class NoticeDao {

	//공지사항 목록 조회
	public List<NoticeVo> getNoticeList(SqlSession ss) {
		
		return ss.selectList("BoardMapper.selectNoticeList");
	}

}
