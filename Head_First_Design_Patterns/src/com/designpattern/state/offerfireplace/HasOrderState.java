package com.designpattern.state.offerfireplace;

import java.util.Random;
public class HasOrderState implements State {
	
	Random randomWinner = new Random(System.currentTimeMillis());
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
		int winner = randomWinner.nextInt(5);		
		if ((winner == 0) && (fireplaceOrder.getCount() > 1)) {
			fireplaceOrder.setState(fireplaceOrder.getRewardState());
		} else {
			if (fireplaceOrder.getCount() == 0) {
			fireplaceOrder.setState(fireplaceOrder.getSoldOutState());
			System.out.println("Oops, Out of stock!");
			
		} else {
			fireplaceOrder.setState(fireplaceOrder.getHasOrderState());
		}
		}
	}
    
//	public void refill() {}
	 
	public String toString() {
		return "waiting for Fireplace Order";
	}
}
