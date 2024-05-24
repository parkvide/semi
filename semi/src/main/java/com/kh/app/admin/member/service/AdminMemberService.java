package com.kh.app.admin.member.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.member.dao.AdminMemberDao;
import com.kh.app.member.vo.MemberVo;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

public class AdminMemberService {

	private final AdminMemberDao dao;
	
	public AdminMemberService() {
		this.dao = new AdminMemberDao();
	}
	
	public int getAdminCnt() throws Exception {
		
		SqlSession ss = getSqlSession();
		int cnt = dao.getMemberCnt(ss);
		
		ss.close();
		
		return cnt;
		
	}

}
