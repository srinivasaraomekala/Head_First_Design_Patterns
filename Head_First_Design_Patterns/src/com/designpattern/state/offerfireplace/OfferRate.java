package com.designpattern.state.offerfireplace;

public class OfferRate implements State {

    FireplaceOrder fireplaceOrder;
 
    public OfferRate(FireplaceOrder fireplaceOrder) {
        this.fireplaceOrder = fireplaceOrder;
    }
 
	public void orderFireplace() {
		System.out.println("You have ordered a Fireplace");
	}
 
	public void dispatchFireplace() {
		System.out.println("Fireplace is ready to dispatch");
	}
 
	public void deliverFireplace() {
		System.out.println("Your order on the way");
		}
	
	public void installFireplace() {		
		fireplaceOrder.releaseFireplace();
		if (fireplaceOrder.getCount() == 0) {
			fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
			System.out.println("Oops, Out of stock!");
		} else {
			//fireplaceOrder.releaseFireplace();
			System.out.println("Your Fireplace is ready to install");
			System.out.println("You got 10% offer on your Order");
			if (fireplaceOrder.getCount() > 0) {
				fireplaceOrder.setState(fireplaceOrder.getHasOrderState());
			} else {
            	System.out.println("Oops, Out of stock!");
				fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
			}
		}
	}
	
		
 
	//public void refill() { }
	
	public String toString() {
		return "Reducing 10% cost on your order, because you are a Winner";
	}
}
