package com.kh.app.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.cart.vo.CartVo;
import com.kh.app.member.vo.MemberVo;
import com.kh.app.store.service.ProductService;

@WebServlet("/store/cart")
public class CartController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			if(loginMemberVo == null) {
				req.setAttribute("alertMsg", "로그인후 이용가능합니다.");
				resp.sendRedirect("/app/member/login");
			}
			ProductService ps = new ProductService();
			List<CartVo> cartItem = ps.getAllCartItems();
			req.setAttribute("cartItem", cartItem);
			req.getRequestDispatcher("/WEB-INF/views/store/cart.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			HttpSession session = req.getSession();
			String action = req.getParameter("action");
			ProductService ps = new ProductService();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			if("add".equals(action)) {
				String memNo = loginMemberVo.getNo();
				String prdNo = req.getParameter("productNo");
				int quantity = Integer.parseInt(req.getParameter("quantity"));
				
				CartVo vo = new CartVo();
				vo.setProductNo(prdNo);
				vo.setMemNo(memNo);
				vo.setQuantity(quantity);
				
				ps.addCartItem(vo);
			}else if("remove".equals(action)) {
				String prdNo = req.getParameter("productNo");
				String memNo = loginMemberVo.getNo();
				
				CartVo vo = new CartVo();
				vo.setProductNo(prdNo);
				vo.setMemNo(memNo);
				ps.removeCartItem(vo);
			}
			resp.sendRedirect("/app/store/cart");
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
}
