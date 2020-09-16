package com.ankit;

public class Product {
private String productName;
private double ratePerUnit;
private int productId;
private int productType;
private int quantity;
private double discount;
public Product(String productName, double ratePerUnit, int productId, int productType, int quantity, double discount) {
	super();
	this.productName = productName;
	this.ratePerUnit = ratePerUnit;
	this.productId = productId;
	this.productType = productType;
	this.quantity = quantity;
	this.discount = discount;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public Product(int productType) {
	super();
	this.productType = productType;
}
public int getProductType() {
	return productType;
}
public void setProductType(int productType) {
	this.productType = productType;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(String productName, double ratePerUnit, int productId, int productType) {
	super();
	this.productName = productName;
	this.ratePerUnit = ratePerUnit;
	this.productId = productId;
	this.productType = productType;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getRatePerUnit() {
	return ratePerUnit;
}
public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
}
