package com.jsp.jcart_web_app.dto;

import java.io.InputStream;
public class Product {
  private int productId;
  private String productName;
  private String productType;
  private String productWearType;
  private long productPrice;
  private String verify;
  private InputStream inputStream;
/**
 * @param productName
 * @param productType
 * @param productWearType
 * @param productPrice
 * @param inputStream
 */
public Product(String productName, String productType, String productWearType, long productPrice,
		InputStream inputStream) {
	super();
	this.productName = productName;
	this.productType = productType;
	this.productWearType = productWearType;
	this.productPrice = productPrice;
	this.inputStream = inputStream;
}
/**
 * @param productId
 * @param productName
 * @param productType
 * @param productWearType
 * @param productPrice
 * @param inputStream
 */
public Product(int productId, String productName, String productType, String productWearType, long productPrice,
		InputStream inputStream) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productType = productType;
	this.productWearType = productWearType;
	this.productPrice = productPrice;
	this.inputStream = inputStream;
}
/**
 * @param productId
 * @param productName
 * @param productType
 * @param productWearType
 * @param productPrice
 * @param verify
 * @param inputStream
 */
public Product(int productId, String productName, String productType, String productWearType, long productPrice,
		 InputStream inputStream,String verify) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productType = productType;
	this.productWearType = productWearType;
	this.productPrice = productPrice;
	this.verify = verify;
	this.inputStream = inputStream;
}
public String getVerify() {
	return verify;
}
/**
 * @param productId
 * @param productName
 * @param productType
 * @param productWearType
 * @param productPrice
 * @param verify
 * @param inputStream
 */
public Product(int productId, String productName, String productType, String productWearType, long productPrice,
		String verify, InputStream inputStream) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productType = productType;
	this.productWearType = productWearType;
	this.productPrice = productPrice;
	this.verify = verify;
	this.inputStream = inputStream;
}
/**
 * @param productName
 * @param productType
 * @param productWearType
 * @param productPrice
 * @param verify
 * @param inputStream
 */
public Product(String productName, String productType, String productWearType, long productPrice, String verify,
		InputStream inputStream) {
	super();
	this.productName = productName;
	this.productType = productType;
	this.productWearType = productWearType;
	this.productPrice = productPrice;
	this.verify = verify;
	this.inputStream = inputStream;
}
public void setVerify(String verify) {
	this.verify = verify;
}
public InputStream getInputStream() {
	return inputStream;
}
public void setInputStream(InputStream inputStream) {
	this.inputStream = inputStream;
}
public long getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productId) {
	this.productId = productId;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getProductWearType() {
	return productWearType;
}
public void setProductWearType(String productWearType) {
	this.productWearType = productWearType;
}
/**
 * @param productId
 * @param productName
 * @param productType
 * @param productWearType
 */
public Product(int productId, String productName, String productType, String productWearType,long productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productType = productType;
	this.productWearType = productWearType;
	this.productPrice=productPrice;
}
/**
 * @param productName
 * @param productType
 * @param productWearType
 */
public Product(String productName, String productType, String productWearType) {
	super();
	this.productName = productName;
	this.productType = productType;
	this.productWearType = productWearType;
	
}
  
}
