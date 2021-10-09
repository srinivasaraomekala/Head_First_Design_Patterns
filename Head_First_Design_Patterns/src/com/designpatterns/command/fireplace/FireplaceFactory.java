package com.designpatterns.command.fireplace;

public class FireplaceFactory {
	FireplaceOrder fireplaceOrder; 
	public FireplaceFactory() {}
	public void chooseFireplaceOrder(FireplaceOrder fireplaceOrder) {
		this.fireplaceOrder = fireplaceOrder;
		fireplaceOrder.orderUp();
	}
}