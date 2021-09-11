package com.designpatterns.abstractfactory;

public class ElectricFireFactory implements FirePlaceFactory{

	@Override
	public GasFire createGasFire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectricFire createElectricFire() {
		// TODO Auto-generated method stub
		return new ElectricFire();
	}

	@Override
	public WoodFire createWoodFire() {
		// TODO Auto-generated method stub
		return null;
	}


}
