package com.kh.app.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.vo.AdminVo;

public class AdminDao {

	public AdminVo login(SqlSession ss, AdminVo vo) {
		return ss.selectOne("AdminMapper.adminlogin", vo);
	}


}
