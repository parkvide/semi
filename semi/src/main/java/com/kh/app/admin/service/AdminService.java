package com.kh.app.admin.service;
import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.dao.AdminDao;
import com.kh.app.admin.vo.AdminVo;


public class AdminService {

	private final AdminDao dao;
	
	public AdminService() {
		this.dao = new AdminDao();
	}
	
	public AdminVo login(AdminVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		AdminVo loginAdminVo = dao.login(ss ,vo);
		
		ss.close();
		
		return loginAdminVo;
	}

}
