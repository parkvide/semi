package com.kh.app.member.service;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.SqlSessionTemplate;
import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;
public class MemberService {

	private final MemberDao dao;
	
	public MemberService() {
		this.dao = new MemberDao();
	}
	
	//회원가입
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
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.join(ss, vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
	}
	
	//로그인
	public MemberVo login(MemberVo vo) throws Exception {
		
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		MemberVo loginMemberVo = dao.login(ss, vo);
		ss.close();
		return loginMemberVo;
	}

	//회원탈퇴
	public int quit(String no) throws Exception {
		
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.quit(ss, no);
		ss.close();
		return result;
	}

	public int pwdEdit(MemberVo vo) throws Exception {
		if(vo.getPwd().length() < 4) {
			throw new Exception("비밀번호가 너무 짧습니다.");
		}
		if(!vo.getPwd().equals(vo.getPwd2())) {
			throw new Exception("비밀번호가 일치하지 않음..");
		}
		
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		int result = dao.pwdEdit(ss, vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
	}

}
