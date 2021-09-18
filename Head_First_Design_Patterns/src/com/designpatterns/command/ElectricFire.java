package com.designpatterns.command;

public class ElectricFire extends Fire{

	@Override
	public void prepareFire() {
		System.out.println("\tintiating fire for "+fireType);
	}
	@Override
	public String toString() {
		return "\tElectric fire is turned on enjoy your day!";
	}

}
