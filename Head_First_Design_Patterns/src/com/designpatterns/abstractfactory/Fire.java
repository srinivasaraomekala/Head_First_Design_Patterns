package com.designpatterns.abstractfactory;

public abstract class Fire {
	String name;
	
	WoodFire wood;
	
	GasFire gas;
	
	ElectricFire electricFire;
	
	public WoodFire getWood() {
		return wood;
	}

	public void setWood(WoodFire wood) {
		this.wood = wood;
	}

	public GasFire getGas() {
		return gas;
	}

	public void setGas(GasFire gas) {
		this.gas = gas;
	}

	public ElectricFire getElectricFire() {
		return electricFire;
	}

	public void setElectricFire(ElectricFire electricFire) {
		this.electricFire = electricFire;
	}

	abstract void prepareFire();
	
	void placeWood() {
		System.out.println("Placing wood in fire place");
	}
	
	void turnOnGas() {
		System.out.println("Turning on gas...");
	}
	
	void switchOnPower() {
		System.out.println("Turning on power...");
	}
	
	void makeFire(String type) {
		System.out.println("Fire placed on "+type);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String unknownOption() {
		return "Option is not available";
	}

	@Override
	public String toString() {
		StringBuffer buffer =new StringBuffer();
		buffer.append("-----"+ name + "----\n");
		if(null!= wood) {
			buffer.append(wood);
			buffer.append("\n");
		}
		
		if(null!= gas) {
			buffer.append(gas);
			buffer.append("\n");
		}
		
		if(null!= electricFire) {
			buffer.append(electricFire);
			buffer.append("\n");
		}
		
		return buffer.toString();
	}
	
	
	
}
