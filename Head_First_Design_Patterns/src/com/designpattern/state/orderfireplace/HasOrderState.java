package com.designpattern.state.orderfireplace;

public class HasOrderState implements State {
	FireplaceOrder fireplaceOrder;
 
	public HasOrderState(FireplaceOrder fireplaceOrder) {
		this.fireplaceOrder = fireplaceOrder;
	}
  
	public void orderFireplace() {
		System.out.println("You have ordered a Fireplace");
	}
 
	public void dispatchFireplace() {
		System.out.println("Fireplace has dispatched");
	}
 
	public void deliverFireplace() {
		System.out.println("Your Fireplace has been successfully delivered");
		}

	public void installFireplace() {
		System.out.println("Fireplace is ready to install");
		fireplaceOrder.releaseFireplace();
		if (fireplaceOrder.getCount() > 0) {
			fireplaceOrder.setState(fireplaceOrder.getHasOrderState());
		} else {
			fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
		}
	}
    
	public void refill() {
		fireplaceOrder.refill(5);
	}
	 
	public String toString() {
		return "waiting for Fireplace Order";
	}
}
