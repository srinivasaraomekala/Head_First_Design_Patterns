package com.designpatterns.abstractfactory;

public class GasFire extends Fire{
	

	@Override
	void prepareFire() {
		System.out.println("intiating fire for "+name);
	}
}
