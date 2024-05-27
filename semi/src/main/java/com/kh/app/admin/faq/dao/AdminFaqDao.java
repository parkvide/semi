package com.kh.app.admin.faq.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.faq.vo.AdminFaqVo;

public class AdminFaqDao {

	public int insert(SqlSession ss, AdminFaqVo vo) {
		return ss.insert("AdminMapper.faqInsert" , vo);
	}

}
