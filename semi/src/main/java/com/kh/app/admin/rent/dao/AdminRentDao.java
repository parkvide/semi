package com.kh.app.admin.rent.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.rent.vo.AdminRentVo;

public class AdminRentDao {

		
	public List<AdminRentVo> list(SqlSession ss){
		return ss.selectList("AdminMapper.selectList");
	}



	public AdminRentVo selectOne(SqlSession ss, String no) {
		return ss.selectOne("AdminMapper.rentSelectOne");
	}

	public int writer(SqlSession ss, AdminRentVo adminRentVo) {
		return ss.update("AdminMapper.rentWriter" , adminRentVo);
	}

}
