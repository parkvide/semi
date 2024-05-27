package com.kh.app.admin.store.service;

import com.kh.app.admin.store.dao.AdminStoreDao;
import com.kh.app.admin.store.vo.AdminStoreVo;
import com.kh.app.db.SqlSessionTemplate;

import static com.kh.app.db.SqlSessionTemplate.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


public class AdminStoreService {

	private final AdminStoreDao dao;
	
	public AdminStoreService() {
		this.dao = new AdminStoreDao();
	}
	
	public int insert(AdminStoreVo vo) throws Exception {
		
		SqlSession ss = getSqlSession();
		 int result = dao.insert(ss,vo);
		 
		 if(result == 1) {
			 ss.commit();
		 }else {
			ss.rollback();
		}
		 ss.close();
		 
		
		return result;
	}

	   public List<AdminStoreVo> getAllProducts() throws Exception {
	        SqlSession ss = getSqlSession();
	        List<AdminStoreVo> storeList = dao.getAllProducts(ss);
	        ss.close();
	        return storeList;
	    }

	public int delete(String no) throws Exception {

		SqlSession ss = getSqlSession();
		int result = dao.delete(ss, no);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		return result;
		
	
	}




}
