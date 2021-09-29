package com.designpattern.state.fireplace;

public class FireplaceFactory {

	State fireplaceSoldOut;
	State noFireplace;
	State hasFireplace;
	State fireplaceSold;
 
	State state = fireplaceSoldOut;
	int count = 0;
 
	public FireplaceFactory(int numberFireplaces) {
		fireplaceSoldOut = new FireplaceSoldOut(this);
		noFireplace = new NoFireplace(this);
		hasFireplace = new HasFireplace(this);
		fireplaceSold = new FireplaceSold(this);

		this.count = numberFireplaces;
 		if (numberFireplaces > 0) {
			state = noFireplace;
		} 
	}
 
	public void insertFireplace() {
		state.insertFireplace();
	}
 
	public void releaseFireplace() {
		state.releaseFireplace();
	}
 
	public void depotFireplace() {
		state.depotFireplace();
		state.distribute();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void replaceFireplace() {
		System.out.println("A Fireplace is coming from Fireplace Factory");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The Fireplace Factory just replaced; New count is: " + this.count);
		state.loadstock();
	}

    public State getState() {
        return state;
    }

    public State getFireplaceSoldOut() {
        return fireplaceSoldOut;
    }

    public State getNoFireplace() {
        return noFireplace;
    }

    public State getHasFireplace() {
        return hasFireplace;
    }

    public State getFireplaceSold() {
        return fireplaceSold;
    }

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nThe Design Fireplace Factory");
		result.append("\nJava-enabled Standing Fireplace Model #2021");
		result.append("\nInventory: " + count + " Fireplace");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Factory is " + state + "\n");
		return result.toString();
	}
}