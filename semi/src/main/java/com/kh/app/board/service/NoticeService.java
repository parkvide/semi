package com.kh.app.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.NoticeDao;
import com.kh.app.board.vo.NoticeVo;
import com.kh.app.db.SqlSessionTemplate;

public class NoticeService {

	private final NoticeDao dao;
	
	public NoticeService() {
		this.dao = new NoticeDao();
	}
	
	//공지사항 목록조회
	public List<NoticeVo> getNoticeList() throws Exception {
		
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		List<NoticeVo> voList = dao.getNoticeList(ss);
		ss.close();
		
		return voList;
	}

}
