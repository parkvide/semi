package com.kh.app.admin.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.faq.vo.AdminFaqVo;
import com.kh.app.admin.notice.vo.AdminNoticeVo;

public class AdminNoticDao {

	public int insert(SqlSession ss, AdminFaqVo vo) {
		return ss.insert("AdminMapper.noticInsert" , vo);
			
	}

	public List<AdminNoticeVo> list(SqlSession ss) {
		return ss.selectList("AdminMapper.noticList");
	}

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.noticeDelete", no);
	}

}
