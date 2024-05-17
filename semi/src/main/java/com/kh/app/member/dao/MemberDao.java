package com.kh.app.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.kh.app.db.JDBCTemplate.*;

import com.kh.app.member.vo.MemberVo;

public class MemberDao {

	public int join(Connection conn, MemberVo vo) throws Exception {

		//sql
		String sql = "INSERT INTO MEMBER(NO, ID, PWD, NAME, BIRTH, EMAIL, PHONE) VALUES (SEQ_MEMBER.NEXTVAL, ?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(1, vo.getPwd());
		pstmt.setString(1, vo.getName());
		pstmt.setString(1, vo.getBirth());
		pstmt.setString(1, vo.getEmail());
		pstmt.setString(1, vo.getPhone());
		
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	public MemberVo login(Connection conn, MemberVo vo) throws Exception {
		
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ? AND QUIT_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo loginMemberVo = null;
		if(rs.next()) {
			String no = rs.getString("NO");
			String id = rs.getString("ID");
			String pwd = rs.getString("PWD");
			String name = rs.getString("NAME");
			String birth = rs.getString("BIRTH");
			String email = rs.getString("EMAIL");
			String phone = rs.getString("PHONE");
			String quitYn = rs.getString("QUIT_YN");
			String enrollDate = rs.getString("ENROLL_DATE");
			String modifyDate = rs.getString("MODIFY_DATE");
			
			loginMemberVo = new MemberVo();
			loginMemberVo.setNo(no);
			loginMemberVo.setId(id);
			loginMemberVo.setId(pwd);
			loginMemberVo.setId(name);
			loginMemberVo.setId(birth);
			loginMemberVo.setId(email);
			loginMemberVo.setId(phone);
			loginMemberVo.setId(quitYn);
			loginMemberVo.setId(enrollDate);
			loginMemberVo.setId(modifyDate);
			
		}
		
		close(rs);
		close(rs);
		
		return loginMemberVo;
		
	}

	public int quit(Connection conn, String no) throws Exception {
		
		String sql = "UPDATE MEMBER SET QUIT_YN = 'Y' WHERE NO = ? AND DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	public int edit(Connection conn, MemberVo vo) throws Exception {
		
		String sql = "UPDATE MEMBER SET PWD = ? WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getPwd());
		pstmt.setString(2, vo.getNo());
		
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	

}