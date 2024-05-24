package com.kh.app.admin.member.dao;

import org.apache.ibatis.session.SqlSession;

public class AdminMemberDao {

	public int getMemberCnt(SqlSession ss) {
		
		return ss.selectOne("AdminMapper.adminMemberlist");
		
	}

}
