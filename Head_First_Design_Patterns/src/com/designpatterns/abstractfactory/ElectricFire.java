package com.designpatterns.abstractfactory;

public class ElectricFire extends Fire{

	@Override
	void prepareFire() {
		System.out.println("intiating fire for "+name);
	}
}
