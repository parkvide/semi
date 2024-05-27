package com.kh.app.admin.store.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.admin.store.vo.AdminStoreVo;

public class AdminStoreDao {

	public int insert(SqlSession ss, AdminStoreVo vo) {

		return ss.insert("AdminMapper.storeInsert" , vo);
	}

	  public List<AdminStoreVo> list(SqlSession ss) {
	        return ss.selectList("AdminMapper.storeList");
	    }

	public int delete(SqlSession ss, String no) {
		return ss.delete("AdminMapper.StoreDelete", no);
	}

}
