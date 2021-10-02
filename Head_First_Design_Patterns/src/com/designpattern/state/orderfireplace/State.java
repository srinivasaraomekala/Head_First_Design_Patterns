package com.designpattern.state.orderfireplace;

public interface State {
 
	public void orderFireplace();
	public void dispatchFireplace();
	public void deliverFireplace();
	public void installFireplace();
	
	public void refill();
}
