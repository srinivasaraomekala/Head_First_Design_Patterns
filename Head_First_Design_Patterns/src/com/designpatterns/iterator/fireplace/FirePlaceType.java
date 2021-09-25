package com.designpatterns.iterator.fireplace;

public class FirePlaceType {
	String fireplacename;
	String description;
	double firePlaceCost;
	boolean isFireTypeWood;

	public FirePlaceType(String fireplacename, String description, double firePlaceCost) {
		this.fireplacename = fireplacename;
		this.description = description;
		this.firePlaceCost = firePlaceCost;
	}

	public String getName() {
		return fireplacename;
	}

	public String getDescription() {
		return description;
	}

	public double getFirePlaceCost() {
		return firePlaceCost;
	}

	public boolean isFireTypeWood() {
		return isFireTypeWood;
	}

}