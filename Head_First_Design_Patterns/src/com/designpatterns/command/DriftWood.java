package com.designpatterns.command;

public class DriftWood  extends Fire{
	

	@Override
	public String toString() {
		return "\tDriftWood is collected from nature/forest";
	}

	@Override
	public	void prepareFire() {
		System.out.println("\tInitiating for for "+fireType);
	}	
}
	


