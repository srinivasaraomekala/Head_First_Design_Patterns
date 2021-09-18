package com.designpatterns.command;

public class GasFire extends Fire{

	@Override
	public void prepareFire() {
		System.out.println("\tintiating fire for "+fireType);
	}
	@Override
	public String toString() {
		return "\tGas fire is turned on enjoy your day!";
	}


}
