package com.designpattern.state.orderfireplace;

public class FireplaceOrder {
 
	State soldOutState;
	State noOrderState;
	State hasOrderState;
	State soldState;
 
	State state;
	int count = 0;
 
	public FireplaceOrder(int numberofFireplaces) {
		soldOutState = new SoldOutState(this);
		noOrderState = new NoOrderState(this);
		hasOrderState = new HasOrderState(this);
		soldState = new SoldState(this);

		this.count = numberofFireplaces;
 		if (numberofFireplaces > 0) {
			state = hasOrderState;
		} else {
		state = soldOutState;
		}
	}
 
	public void orderFireplace() {
		state.orderFireplace();
	}
 
	public void dispatchFireplace() {
		state.dispatchFireplace();
	}
 
	public void deliverFireplace() {
		state.deliverFireplace();
		state.installFireplace();
	}
	
	/*public void installFireplace() {
		state.installFireplace();
	}*/

	void getState(State state) {
		this.state = state;
	}
 
	void releaseFireplace() {
		//System.out.println("Fireplace Factory is ready for order");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The Fireplace factory is ready with new stock");
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}
	
    public State getState() {
        return state;
    }
    public State getHasOrderState() {
        return hasOrderState;
    }
    
    public State getSoldState() {
        return soldState;
    }
    
    public State getNoOrderState() {
        return noOrderState;
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nFireplace Online Order");
		result.append("\nJava-enabled Fireplace Factory Model #2021");
		result.append("\nInventory: " + count + " Fireplace");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Fireplace Factory is " + state + "\n");
		return result.toString();
	}
}
