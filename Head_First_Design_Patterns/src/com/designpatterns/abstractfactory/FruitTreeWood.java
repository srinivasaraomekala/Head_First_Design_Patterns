package com.designpatterns.abstractfactory;

public class FruitTreeWood  extends Fire{
	
	FirePlaceFactory firePlaceFactory;
	
	public FruitTreeWood(FirePlaceFactory firePlaceFactory) {
		this.firePlaceFactory = firePlaceFactory;
	}

	public String toString() {
		return "FruitTreeWood is comes up with nature fruit fragrance";
	}

	@Override
	void prepareFire() {
		System.out.println("Initiating for for "+name);
		wood =firePlaceFactory.createWoodFire(); 
	}
}


