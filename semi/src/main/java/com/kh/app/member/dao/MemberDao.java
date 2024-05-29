package com.kh.app.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import static com.kh.app.db.SqlSessionTemplate.*;

import com.kh.app.member.vo.MemberVo;

public class MemberDao {

	//회원가입
	public int join(SqlSession ss, MemberVo vo) throws Exception {

		return ss.insert("MemberMapper.join" , vo);
	}
	
	//로그인
	public MemberVo login(SqlSession ss, MemberVo vo) throws Exception {
		
		return ss.selectOne("MemberMapper.login", vo);
	}
	
	//회원탈퇴
	public int quit(SqlSession ss, String no) throws Exception {
		
		return ss.update("MemberMapper.quit", no);
	}
	
	//비번 변경
	public int pwdEdit(SqlSession ss, MemberVo vo) throws Exception {
		
		return ss.update("MemberMapper.pwdEdit", vo);
	}

	

}