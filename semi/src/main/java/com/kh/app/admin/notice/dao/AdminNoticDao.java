package com.kh.app.admin.notice.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.faq.vo.AdminFaqVo;

public class AdminNoticDao {

	public int insert(SqlSession ss, AdminFaqVo vo) {
		return ss.insert("AdminMapper.noticInsert" , vo);
			
	}

}
