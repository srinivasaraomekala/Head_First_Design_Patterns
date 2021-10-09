package com.designpatterns.command.fireplace;

public class Customer {
	FireplaceFactory fireplaceFactory;
	FireplaceOrder fireplaceOrder;
	public Customer(FireplaceFactory fireplaceFactory) {
		this.fireplaceFactory = fireplaceFactory;
	}
	public void createOrder(FireplaceOrder fireplaceOrder) {
		this.fireplaceOrder = fireplaceOrder;
	}
	public void Fireit() {
		fireplaceFactory.chooseFireplaceOrder(fireplaceOrder);
	}
}