package com.designpatterns.abstractfactory;

public class OakTreeWood extends Fire {
	
	FirePlaceFactory firePlaceFactory;
	
	public OakTreeWood(FirePlaceFactory firePlaceFactory) {
		this.firePlaceFactory = firePlaceFactory;
	}

	public String toString() {
		return "OakTreeWood is long time fire wood";
	}

	@Override
	void prepareFire() {
		System.out.println("Initiating for for "+name);
		wood =firePlaceFactory.createWoodFire(); 
	}
}
