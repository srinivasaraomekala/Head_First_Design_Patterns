package com.designpattern.state.offerfireplace;

public class SoldOutState implements State {
    FireplaceOrder fireplaceOrder;
 
    public SoldOutState(FireplaceOrder fireplaceOrder) {
        this.fireplaceOrder = fireplaceOrder;
    }
 
	public void orderFireplace() {
		System.out.println("You can't order a Fireplace, the Factory is out of stock");
	}
 
	public void dispatchFireplace() {
		System.out.println("We are unable to dispatch your Fireplace");
	}
 
	public void deliverFireplace() {
		System.out.println("We are waiting for new stock!");
	}
 
	public void installFireplace() {
			System.out.println("Apologies, Fireplaces are out of stock");
	}
	
	//public void refill() {
		//fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
	//}
	
	public String toString() {
		return "Out of Stock";
	}
}