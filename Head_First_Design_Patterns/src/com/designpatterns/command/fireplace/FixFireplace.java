package com.designpatterns.command.fireplace;

public class FixFireplace implements FireplaceOrder {
	ConstructFireplace constructFireplace;
	public FixFireplace(ConstructFireplace constructFireplace) {
		this.constructFireplace = constructFireplace;
	}
	public void orderUp() {
		constructFireplace.makeWoodFireplace();
		constructFireplace.makeGasFireplace();
		constructFireplace.makeElectricFireplace();
	}
}