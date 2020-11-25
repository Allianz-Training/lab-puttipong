package com.allianz.helloWorld;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name, Date date) {
		customer = new Customer(name);
		this.date = date;
	}
	public String getName() {
		return customer.getName();
	}

	public Date getDate() {
		return date;
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double ex) {
		this.productExpense = ex;
	}
	public double getTotalExpense() {
		if(customer.isMember()==true) {
			DiscountRate rate = new DiscountRate();
			return productExpense * (1-rate.getProductDiscountRate(customer.getMemberType())) + (serviceExpense * (1- rate.getServiceDiscountRate(customer.getMemberType())));
		} else { 
			return productExpense + serviceExpense; 
		}
	}
	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}
}
