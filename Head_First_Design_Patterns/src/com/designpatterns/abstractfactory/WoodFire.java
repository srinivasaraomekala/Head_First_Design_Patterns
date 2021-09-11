package com.designpatterns.abstractfactory;

public class WoodFire extends Fire{

	@Override
	void prepareFire() {
		System.out.println("intiating fire for "+name);
	}
}
