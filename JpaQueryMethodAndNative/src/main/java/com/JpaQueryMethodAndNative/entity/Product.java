package com.JpaQueryMethodAndNative.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


@Entity

public class Product {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   public int productId;
   public String productName;
   public Long productPrice;
   public Boolean productAvailability;
public Product(int productId, String productName, Long productPrice, Boolean productAvailability) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
	this.productAvailability = productAvailability;
}
public Product() {
	
	
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
public Long getProductPrice() {
	return productPrice;
}
public void setProductPrice(Long productPrice) {
	this.productPrice = productPrice;
}
public Boolean getProductAvailability() {
	return productAvailability;
}
public void setProductAvailability(Boolean productAvailability) {
	this.productAvailability = productAvailability;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
			+ ", productAvailability=" + productAvailability + "]";
}
   
   
   
}
