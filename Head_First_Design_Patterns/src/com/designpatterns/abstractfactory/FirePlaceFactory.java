package com.designpatterns.abstractfactory;

public interface FirePlaceFactory {
	public GasFire createGasFire();
	public ElectricFire createElectricFire();
	public WoodFire createWoodFire();
}
