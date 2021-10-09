package com.designpatterns.command.fireplace;

public class ConstructFireplace {
	public ConstructFireplace() {}
	
	public void makeWoodFireplace() {
		System.out.println("Construct Wood Fireplace");
	}
	
	public void makeGasFireplace() {
		System.out.println("Construct Gas Fireplace");
	}
	
	public void makeElectricFireplace() {
		System.out.println("Construct Electric Fireplace");
	}
}