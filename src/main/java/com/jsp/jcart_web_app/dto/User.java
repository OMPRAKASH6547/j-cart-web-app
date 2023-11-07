package com.jsp.jcart_web_app.dto;

public class User {

	private int userId;
	private String userName;
	/**
	 * @param userEmail
	 * @param userPassword
	 */
	public User(String userEmail, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	/**
	 * @param userId
	 * @param userPhone
	 * @param userAddress
	 */
	public User(long userPhone,  String userAddress,int userId) {
		super();
		
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userId = userId;
	}
	private String userEmail;
	private long userPhone;
	private String userPassword;
	private String userAddress;
	public User() {
		super();
	}
	public User(int userId, String userName, String userEmail, long userPhone, String userPassword,
			String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
	}
	
	
	public User(String userName, String userEmail, long userPhone, String userPassword, String userAddress) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	/**
	 * @param userPhone
	 * @param userAddress
	 */
	public User(long userPhone, String userAddress) {
		super();
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}
	
	
	
}
