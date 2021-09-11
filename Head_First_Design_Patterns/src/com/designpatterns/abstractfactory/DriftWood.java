package com.designpatterns.abstractfactory;

public class DriftWood  extends Fire{
	
	FirePlaceFactory firePlaceFactory;
	
	public DriftWood(FirePlaceFactory firePlaceFactory) {
		this.firePlaceFactory = firePlaceFactory;
	}

	public String toString() {
		return "DriftWood is collected from nature/forest";
	}

	@Override
	void prepareFire() {
		System.out.println("Initiating for for "+name);
		wood =firePlaceFactory.createWoodFire(); 
	}	
}
	


