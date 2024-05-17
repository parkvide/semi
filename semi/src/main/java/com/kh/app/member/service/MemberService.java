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
	
	public int join(MemberVo vo) throws Exception {
		//서비스 로직
		if(vo.getId().length() < 4) {
			throw new Exception("아이디가 너무 짧습니다.");
		}
		if(vo.getPwd().length() < 4) {
			throw new Exception("비밀번호가 너무 짧습니다.");
		}
		if(!vo.getPwd().equals(vo.getPwd2())) {
			throw new Exception("비밀번호가 일치하지 않습니다.");
		}
		//DAO호출
		Connection conn = getConnection();
		int result = dao.join(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public MemberVo login(MemberVo vo) throws Exception {
		
		Connection conn = getConnection();
		MemberVo loginMemberVo = dao.login(conn, vo);
		
		close(conn);
		
		return loginMemberVo;
	}

	public int quit(String no) throws Exception {
		
		Connection conn = getConnection();
		int result = dao.quit(conn, no);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public int edit(MemberVo vo) throws Exception {
		if(vo.getPwd().length() < 4) {
			throw new Exception("비밀번호가 너무 짧습니다.");
		}
		if(!vo.getPwd().equals(vo.getPwd2())) {
			throw new Exception("비밀번호가 일치하지 않음..");
		}
		
		Connection conn = getConnection();
		int result = dao.edit(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

}