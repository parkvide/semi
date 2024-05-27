package com.kh.app.store.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.kh.app.db.SqlSessionTemplate.*;

import com.kh.app.cart.vo.CartVo;
import com.kh.app.store.dao.ProductDao;
import com.kh.app.store.vo.ProductVo;

public class ProductService {

	private final ProductDao dao;
	
	public ProductService() {
		this.dao = new ProductDao();
	}
	
	public List<ProductVo> selectPopList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<ProductVo> voList = dao.selectPopList(ss);
		
		ss.close();
		
		return voList;
		
	}

	public List<ProductVo> selectPackList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<ProductVo> voList = dao.selectPackList(ss);
		ss.close();
		
		return voList;
	}

	public List<ProductVo> selectGiftTicket() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<ProductVo> voList = dao.selectGiftTicket(ss);
		ss.close();
		
		return voList;
	}

	public List<ProductVo> selectDrinkList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<ProductVo> voList = dao.selectDrinkList(ss);
		ss.close();
		
		return voList;
	}

	public List<ProductVo> selectComboList() throws Exception {
		
		SqlSession ss = getSqlSession();
		List<ProductVo> voList = dao.selectComboList(ss);
		ss.close();
		
		return voList;
	}

	//상품 상세 뽑기
	public ProductVo getPrdByNo(String no) throws Exception {
		
		SqlSession ss = getSqlSession();
		ProductVo vo = dao.getPrdByNo(ss , no);
		ss.close();
		
		return vo;
	}
	//카트에 아이템 리스트 뽑기
	public List<CartVo> getAllCartItems() throws Exception {
		SqlSession ss = getSqlSession();
		List<CartVo> cartItem =dao.getAllCartItems(ss);
		ss.close();
		return cartItem;
	}
	//카트에 아이템 추가
	public void addCartItem(CartVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.addCartItem(ss, vo);
		
		if( result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
		
	}
	//카트에 아이템 빼기
	public void removeCartItem(CartVo vo) throws Exception {
		SqlSession ss = getSqlSession();
		int result = dao.removeCartItem(ss, vo);
		
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		
	}

}
