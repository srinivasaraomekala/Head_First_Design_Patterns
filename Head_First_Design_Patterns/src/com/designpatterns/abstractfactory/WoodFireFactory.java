package com.designpatterns.abstractfactory;

public class WoodFireFactory implements FirePlaceFactory{

	
	@Override
	public GasFire createGasFire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectricFire createElectricFire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WoodFire createWoodFire() {
		// TODO Auto-generated method stub
		return new WoodFire();
	}


}
