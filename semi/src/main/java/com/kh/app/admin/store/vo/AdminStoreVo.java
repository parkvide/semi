package com.kh.app.admin.store.vo;

public class AdminStoreVo {
	
	private String no;
	private String category;
	private String name;
	private String price;
	private String originCountry;
	private String nutrienteImg;
	private String productImg;
	private String delYn;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	public String getNutrienteImg() {
		return nutrienteImg;
	}
	public void setNutrienteImg(String nutrienteImg) {
		this.nutrienteImg = nutrienteImg;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public AdminStoreVo(String no, String category, String name, String price, String originCountry,
			String nutrienteImg, String productImg, String delYn) {
		super();
		this.no = no;
		this.category = category;
		this.name = name;
		this.price = price;
		this.originCountry = originCountry;
		this.nutrienteImg = nutrienteImg;
		this.productImg = productImg;
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "AdminStoreVo [no=" + no + ", category=" + category + ", name=" + name + ", price=" + price
				+ ", originCountry=" + originCountry + ", nutrienteImg=" + nutrienteImg + ", productImg=" + productImg
				+ ", delYn=" + delYn + "]";
	}
	public AdminStoreVo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
	
	