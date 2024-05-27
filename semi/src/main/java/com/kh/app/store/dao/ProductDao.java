package com.kh.app.store.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.cart.vo.CartVo;
import com.kh.app.store.vo.ProductVo;

public class ProductDao {

	public List<ProductVo> selectPopList(SqlSession ss) {
		return ss.selectList("ProductMapper.selectPopList");
	}

	public List<ProductVo> selectPackList(SqlSession ss) {
		return ss.selectList("ProductMapper.selectPackList");
	}

	public List<ProductVo> selectGiftTicket(SqlSession ss) {
		return ss.selectList("ProductMapper.selectGiftTicket");
	}

	public List<ProductVo> selectDrinkList(SqlSession ss) {
		return ss.selectList("ProductMapper.selectDrinkList");
	}

	public List<ProductVo> selectComboList(SqlSession ss) {
		return ss.selectList("ProductMapper.selectComboList");
	}

	//상품상세조회
	public ProductVo getPrdByNo(SqlSession ss, String no) {
		return ss.selectOne("ProductMapper.getPrdByNo" , no);
				
	}
	//카트 담긴 리스트 뽑기
	public List<CartVo> getAllCartItems(SqlSession ss) {
		return ss.selectList("CartMapper.getAllCartItems");
	}
	//카트에 아이템 insert
	public int addCartItem(SqlSession ss, CartVo vo) {
		return ss.insert("CartMapper.addCartItem" , vo);
	}
	//카트에 아이템 delete
	public int removeCartItem(SqlSession ss, CartVo vo) {
		return ss.delete("CartMapper.removeCartItem", vo);
	}

}
