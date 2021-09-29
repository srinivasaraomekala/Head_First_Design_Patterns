package com.designpattern.state.fireplace;

public class NoFireplace implements State {

    FireplaceFactory fireplaceFactory;
 
    public NoFireplace(FireplaceFactory fireplaceFactory) {
        this.fireplaceFactory = fireplaceFactory;
    }
 
	public void insertFireplace() {
		System.out.println("You inserted a Fireplace");
		fireplaceFactory.setState(fireplaceFactory.getHasFireplace());
	}
 
	public void releaseFireplace() {
		System.out.println("You haven't inserted a Fireplace");
	}
 
	public void depotFireplace() {
		System.out.println("You depoted, but there's no Fireplace");
	 }
 
	public void distribute() {
		System.out.println("You need to pay first");
	} 
	
	public void loadstock() { }
 
	public String toString() {
		return "waiting for Fireplace";
	}
}
