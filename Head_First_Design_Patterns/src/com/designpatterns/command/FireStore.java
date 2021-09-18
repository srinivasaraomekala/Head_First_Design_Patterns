package com.designpatterns.command;

public class FireStore {

	public Fire createFire(String fireSystem) {
		if (FireConstants.GAS_FIRE.equalsIgnoreCase(fireSystem.toUpperCase())) {
			System.out.println("\t---- Making a " + fireSystem);
			GasFire fire = new GasFire();
			fire.fireType = fireSystem;
			fire.prepareFire();
			return fire;
		} else if (FireConstants.ELECTRIC_FIRE.equalsIgnoreCase(fireSystem.toUpperCase())) {
			System.out.println("\t---- Making a " + fireSystem);
			ElectricFire fire = new ElectricFire();
			fire.fireType = fireSystem;
			fire.prepareFire();
			return fire;
		}
		return null;

	}

	public Fire createFire(String fireSystem, String woodType) {
		WoodFire fire = new WoodFire(woodType);
		fire.fireType = fireSystem;
		fire.prepareFire();
		System.out.println("\t---- Making a " + fireSystem);
		return fire;
	}

}
