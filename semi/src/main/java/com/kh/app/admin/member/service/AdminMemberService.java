package com.kh.app.admin.member.service;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.member.dao.AdminMemberDao;
import com.kh.app.admin.member.vo.AdminMemberVo;

public class AdminMemberService {

	private AdminMemberDao dao;
	
	public AdminMemberService() {
		this.dao =  new AdminMemberDao();
	}
	
	public List<AdminMemberVo> list() throws Exception {
		
		 SqlSession ss = getSqlSession();
		 List<AdminMemberVo> voList = dao.list(ss);
		return voList;
	}

}
