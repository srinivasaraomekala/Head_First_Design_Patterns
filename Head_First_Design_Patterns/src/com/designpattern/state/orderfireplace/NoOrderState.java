package com.designpattern.state.orderfireplace;

public class NoOrderState implements State {
    FireplaceOrder fireplaceOrder;
 
    public NoOrderState(FireplaceOrder fireplaceOrder) {
        this.fireplaceOrder = fireplaceOrder;
    }
 
	public void orderFireplace() {
		System.out.println("We are waiting for your order");
		fireplaceOrder.setState(fireplaceOrder.getHasOrderState());
	}
 
	public void dispatchFireplace() {
		System.out.println("You did not order Fireplace");
	}
 
	public void deliverFireplace() {
		System.out.println("There are no orders from you!");
	 }
 
	public void installFireplace() {
		System.out.println("You need to order");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for Fireplace Order";
	}
}