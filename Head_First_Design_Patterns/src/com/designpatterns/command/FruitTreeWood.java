package com.designpatterns.command;

public class FruitTreeWood  extends Fire{
	
	
	@Override
	public String toString() {
		return "\tFruitTreeWood is comes up with nature fruit fragrance";
	}

	@Override
	public void prepareFire() {
		System.out.println("\tInitiating for for "+fireType);
	}
}


