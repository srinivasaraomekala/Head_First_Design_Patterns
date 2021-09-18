package com.designpatterns.command;

public class OakTreeWood extends Fire {
	
	@Override
	public void prepareFire() {
		System.out.println("Initiating for for "+fireType);
	}
	
	@Override
	public String toString() {
		return "OakTreeWood is long time fire wood";
	}
}
