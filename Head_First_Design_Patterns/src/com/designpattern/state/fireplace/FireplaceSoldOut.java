package com.designpattern.state.fireplace;

public class FireplaceSoldOut implements State {
    FireplaceFactory fireplaceFactory;
 
    public FireplaceSoldOut(FireplaceFactory fireplaceFactory) {
        this.fireplaceFactory = fireplaceFactory;
    }
 
	public void insertFireplace() {
		System.out.println("You can't insert a Fireplace, the Fireplace is sold out");
	}
 
	public void releaseFireplace() {
		System.out.println("You can't depot, you haven't inserted a Fireplace yet");
	}
 
	public void depotFireplace() {
		System.out.println("You depoted, but there are no Fireplaces");
	}
 
	public void distribute() {
		System.out.println("No Fireplaces distributed");
	}
	
	public void loadstock() { 
		fireplaceFactory.setState(fireplaceFactory.getNoFireplace());
	}
 
	public String toString() {
		return "sold out";
	}
}