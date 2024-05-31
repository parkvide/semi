package com.kh.app.admin.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.member.vo.AdminMemberVo;
import com.kh.app.db.SqlSessionTemplate;

public class AdminMemberDao {

	public List<AdminMemberVo> list(SqlSession ss) {
		return ss.selectList("AdminMapper.memberList");
	}

}
