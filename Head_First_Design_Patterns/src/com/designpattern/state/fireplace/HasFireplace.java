package com.designpattern.state.fireplace;

import java.util.Random;

public class HasFireplace implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	FireplaceFactory fireplaceFactory;
 
	public HasFireplace(FireplaceFactory fireplaceFactory) {
		this.fireplaceFactory = fireplaceFactory;
	}
  
	public void insertFireplace() {
		System.out.println("You can't insert another Fireplace");
	}
 
	public void releaseFireplace() {
		System.out.println("Fireplace returned");
		fireplaceFactory.setState(fireplaceFactory.getNoFireplace());
	}
 
	public void depotFireplace() {
		System.out.println("You depoted...");
		fireplaceFactory.setState(fireplaceFactory.getFireplaceSold());
		}

    public void distribute() {
        System.out.println("No fireplace distributed");
    }
    
    public void loadstock() { }
 
	public String toString() {
		return "waiting for depot of Fireplace";
	}
}