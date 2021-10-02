package com.designpattern.state.orderfireplace;

public class OfferState implements State {
    FireplaceOrder fireplaceOrder;
 
    public OfferState(FireplaceOrder fireplaceOrder) {
        this.fireplaceOrder = fireplaceOrder;
    }
 
	public void orderFireplace() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
 
	public void dispatchFireplace() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
 
	public void deliverFireplace() {
		System.out.println("Turning again doesn't get you another gumball!");
	}
 
	public void installFireplace() {
		fireplaceOrder.releaseFireplace();
		if (fireplaceOrder.getCount() == 0) {
			fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
		} else {
			fireplaceOrder.releaseFireplace();
			System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
			if (fireplaceOrder.getCount() > 0) {
				fireplaceOrder.setState(fireplaceOrder.getNoOrderState());
			} else {
            	System.out.println("Oops, out of gumballs!");
				fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
			}
		}
	}
 
	public void refill() { }
	
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
