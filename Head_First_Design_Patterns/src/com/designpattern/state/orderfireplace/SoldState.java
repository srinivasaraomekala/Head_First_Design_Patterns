package com.designpattern.state.orderfireplace;

public class SoldState implements State {
    FireplaceOrder fireplaceOrder;
 
    public SoldState(FireplaceOrder fireplaceOrder) {
        this.fireplaceOrder = fireplaceOrder;
    }
       
	public void orderFireplace() {
		System.out.println("Please wait, we are ready to deliver your Fireplace");
	}
 
	public void dispatchFireplace() {
		System.out.println("You have already ordered Fireplace");
	}
 
	public void deliverFireplace() {
		System.out.println("Please wait for your Fireplace, it is on the way");
	}
 
	public void installFireplace() {
		fireplaceOrder.releaseFireplace();
		if (fireplaceOrder.getCount() > 0) {
			fireplaceOrder.setState(fireplaceOrder.getHasOrderState());
		} else {
			System.out.println("Apologies, Fireplaces are out of stock");
			fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "dispatching a Fireplace";
	}
}