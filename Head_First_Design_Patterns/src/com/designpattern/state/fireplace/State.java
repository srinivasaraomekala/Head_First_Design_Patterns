package com.designpattern.state.fireplace;

public interface State {
 
	public void insertFireplace();
	public void releaseFireplace();
	public void depotFireplace();
	public void distribute();
	
	public void loadstock();
}
