package com.designpattern.state.fireplace;

public class FireplaceSold implements State{

    FireplaceFactory fireplaceFactory;
 
    public FireplaceSold(FireplaceFactory fireplaceFactory) {
        this.fireplaceFactory = fireplaceFactory;
    }
       
	public void insertFireplace() {
		System.out.println("Please wait, we're already giving you fireplace");
	}
 
	public void releaseFireplace() {
		System.out.println("Sorry, you already depoted a Fireplace");
	}
 
	public void depotFireplace() {
		System.out.println("Depoted twice doesn't get you another fireplace!");
	}
 
	public void distribute() {
		fireplaceFactory.replaceFireplace();
		if (fireplaceFactory.getCount() > 0) {
			fireplaceFactory.setState(fireplaceFactory.getNoFireplace());
		} else {
			System.out.println("Oops, out of fireplaces!");
			fireplaceFactory.setState(fireplaceFactory.getFireplaceSoldOut());
		}
	}
	
	public void loadstock() { }
 
	public String toString() {
		return "distribute a fireplace";
	}
}