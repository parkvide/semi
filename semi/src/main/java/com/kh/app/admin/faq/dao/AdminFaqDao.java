package com.kh.app.admin.faq.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.faq.vo.AdminFaqVo;

public class AdminFaqDao {

	public int insert(SqlSession ss, AdminFaqVo vo) {
		return ss.insert("AdminMapper.faqInsert" , vo);
	}

	public List<AdminFaqVo> list(SqlSession ss) {
		return ss.selectList("AdminMapper.faqList");
	}

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.faqDelete", no);
	}

}
