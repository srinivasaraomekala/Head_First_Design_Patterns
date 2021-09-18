package com.designpatterns.command;

public class WoodFire extends Fire{
	
	private String woodType;
	
	public WoodFire(String woodType) {
		this.woodType = woodType;
	}

	@Override
	public void prepareFire() {
		System.out.println("\tintiating "+woodType.toLowerCase()+" flavored fire for "+fireType.toLowerCase() );
		if(woodType.equalsIgnoreCase(FireConstants.DRIFT_WOOD)) {
			DriftWood driftWood = new DriftWood();
			driftWood.fireType = fireType;
			driftWood.prepareFire();
		}else if(woodType.equalsIgnoreCase(FireConstants.FRUIT_WOOD)) {
			FruitTreeWood fruitTreeWood = new FruitTreeWood();
			fruitTreeWood.fireType = fireType;
			fruitTreeWood.prepareFire();
		}else if(woodType.equalsIgnoreCase(FireConstants.OAK_TREE_WOOD)) {
			OakTreeWood oakTreeWood = new OakTreeWood();
			oakTreeWood.fireType = fireType;
			oakTreeWood.prepareFire();
		}
	}
	
	@Override
	public String toString() {
		return "\t"+woodType+" fire is turned on enjoy your day!";
	}


}
