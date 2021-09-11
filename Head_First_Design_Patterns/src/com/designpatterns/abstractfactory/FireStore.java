package com.designpatterns.abstractfactory;

public class FireStore extends FireSystem {

	FirePlaceFactory fireFactory = null;
	Fire fire = null;
	@Override
	protected Fire createFire(String fireSystem) {
		if("GAS".equalsIgnoreCase(fireSystem.toUpperCase())) {
			fireFactory = new GasFireFactory();
			fire = fireFactory.createGasFire();
			fire.setGas(fireFactory.createGasFire());
			fire.setName(fireSystem);
			System.out.println("---- Making a "+fireSystem);
			fire.turnOnGas();
			fire.makeFire(fireSystem);
		}else if("ELECTRIC".equalsIgnoreCase(fireSystem.toUpperCase())) {
			fireFactory = new ElectricFireFactory();
			fire = fireFactory.createElectricFire();
			fire.setElectricFire(fireFactory.createElectricFire());
			fire.setName(fireSystem);
			System.out.println("---- Making a "+fire.getName());
			fire.switchOnPower();
			fire.makeFire(fireSystem);
			
		}else if("WOOD".equalsIgnoreCase(fireSystem.toUpperCase())) {
			fireFactory  =new WoodFireFactory();
			fire = fireFactory.createWoodFire();
			fire.setWood(fireFactory.createWoodFire());
			fire.setName(fireSystem);
			System.out.println("---- Making a "+fire.getName());
			fire.placeWood();
			fire.makeFire(fireSystem);
			fire.setName(fireSystem);
		}else {
			fire.unknownOption();
		}
		return fire;}

}
