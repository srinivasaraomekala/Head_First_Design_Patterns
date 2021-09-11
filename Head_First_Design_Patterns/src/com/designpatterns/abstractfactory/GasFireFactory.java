package com.designpatterns.abstractfactory;

public class GasFireFactory implements FirePlaceFactory{

	@Override
	public GasFire createGasFire() {
		// TODO Auto-generated method stub
		return new GasFire();
	}

	@Override
	public ElectricFire createElectricFire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WoodFire createWoodFire() {
		// TODO Auto-generated method stub
		return null;
	}



}
