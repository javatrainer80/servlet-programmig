package com.tech2java.customerinfo.dto;

/**
 * 
 * @author tech2java
 *  ====TABLE Customer=======
 *  CUSTOMER_ID int NOT NULL,
 *  CUSTOMER_NAME varchar(45) NOT NULL,
 *  CUSTOMER_AGE int NOT NULL,
 *  CUSTOMER_ADDRESS varchar(200) DEFAULT NULL,
 */
public class Customer {

	private Integer customerId;
	private String customerName;
	private Integer customerAge;
	private String customerAddress;
	
	//Getters & Setters
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}
