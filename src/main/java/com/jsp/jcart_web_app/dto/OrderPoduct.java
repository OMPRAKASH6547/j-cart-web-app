package com.jsp.jcart_web_app.dto;

public class OrderPoduct {
	private int orderId;
	private String userAddress;
	private String userPhone;
	private String productColor;
	private int productSize;
	private int productQuantity;
	private double finalPrice;
	private int productId;
	private int userId;
	
	
	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	/**
	 * @param orderId
	 * @param userAddress
	 * @param userPhone
	 * @param productColor
	 * @param productSize
	 * @param productQuantity
	 * @param finalPrice
	 * @param productId
	 * @param userId
	 * @param product
	 * @param user
	 */
	public OrderPoduct(int orderId, String userAddress, String userPhone, String productColor, int productSize,
			int productQuantity, double finalPrice, int productId, int userId, Product product, User user) {
		super();
		this.orderId = orderId;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.productColor = productColor;
		this.productSize = productSize;
		this.productQuantity = productQuantity;
		this.finalPrice = finalPrice;
		this.productId = productId;
		this.userId = userId;
		this.product = product;
		this.user = user;
	}



	/**
	 * @param orderId
	 * @param userAddress
	 * @param userPhone
	 * @param productColor
	 * @param productSize
	 * @param productQuantity
	 * @param finalPrice
	 */
	public OrderPoduct(int orderId, String userAddress, String userPhone, String productColor, int productSize,
			int productQuantity, double finalPrice) {
		super();
		this.orderId = orderId;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.productColor = productColor;
		this.productSize = productSize;
		this.productQuantity = productQuantity;
		this.finalPrice = finalPrice;
	}
    
	public OrderPoduct(String userAddress, String userPhone, String productColor, int productSize,
			int productQuantity, double finalPrice,int productId,int userId) {
		super();
//		this.orderId = orderId;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.productColor = productColor;
		this.productSize = productSize;
		this.productQuantity = productQuantity;
		this.finalPrice = finalPrice;
		this.productId=productId;
		this.userId=userId;
	}


	private Product product;
	
	private User user;
	
	

	public OrderPoduct(){
		super();
	}



	public OrderPoduct(String userAddress, String userPhone, String productColor, int productSize,
			int productQuantity, double finalPrice, Product product, User user) {
		super();
		this.orderId = orderId;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.productColor = productColor;
		this.productSize = productSize;
		this.productQuantity = productQuantity;
		this.finalPrice = finalPrice;
		this.product = product;
		this.user = user;
	}



	public OrderPoduct(int orderid ,String userAddress2, String userPhone2, String productcolor2, int size, int quantity,
			Double price, int productId2, int userid2) {
		this.orderId=orderid;
		this.userAddress=userAddress2;
		this.userPhone=userPhone2;
		this.productColor=productcolor2;
		this.productSize=size;
		this.productQuantity=quantity;
		this.finalPrice=price;
		this.productId=productId2;
		this.userId=userid2;
		
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public String getUserAddress() {
		return userAddress;
	}



	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}



	public String getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}



	public String getProductColor() {
		return productColor;
	}



	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}



	public int getProductSize() {
		return productSize;
	}



	public void setProductSize(int productSize) {
		this.productSize = productSize;
	}



	public int getProductQuantity() {
		return productQuantity;
	}



	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}



	public double getFinalPrice() {
		return finalPrice;
	}



	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
	

}
