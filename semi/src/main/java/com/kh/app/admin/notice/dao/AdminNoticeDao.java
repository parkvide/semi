package com.kh.app.admin.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.faq.vo.AdminFaqVo;
import com.kh.app.admin.notice.vo.AdminNoticeVo;

public class AdminNoticeDao {

	public int insert(SqlSession ss, AdminNoticeVo vo) {
		return ss.insert("AdminMapper.noticeInsert" , vo);
			
	}

	public List<AdminNoticeVo> list(SqlSession ss) {
		return ss.selectList("AdminMapper.noticeList");
	}

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.noticeDelete", no);
	}

	public int edit(SqlSession ss, AdminNoticeVo vo) {
		return ss.update("AdminMapper.noticeEdit");
	
	}

}
