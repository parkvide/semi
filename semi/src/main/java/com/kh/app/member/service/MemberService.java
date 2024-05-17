package com.kh.app.member.service;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;
import static com.kh.app.db.JDBCTemplate.*;

import java.sql.Connection;
public class MemberService {

	private final MemberDao dao;
	
	public MemberService() {
		dao = new MemberDao();
	}
	
	public int join(MemberVo vo) throws Exception{
		//서비스 로직
		
		//DAO호출
		Connection conn = getConnection();
		int result = dao.join(conn, vo);
		return result;
	}

}
