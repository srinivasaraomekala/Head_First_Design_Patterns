package com.designpatterns.abstractfactory;

public abstract class FireSystem {
	
	protected abstract Fire createFire(String fire);
	
	public Fire placeFire(String fireSystem) {
	
		Fire fire = createFire(fireSystem);
		
		return fire;
	}
}