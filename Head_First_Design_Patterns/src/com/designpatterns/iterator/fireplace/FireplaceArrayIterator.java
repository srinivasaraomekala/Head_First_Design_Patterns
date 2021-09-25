package com.designpatterns.iterator.fireplace;

public class FireplaceArrayIterator implements Iterator {
	FirePlaceType[] items;
	int position = 0;
 
	public FireplaceArrayIterator(FirePlaceType[] items) {
		this.items = items;
	}
 
	public FirePlaceType next() {
		FirePlaceType fireplaceType = items[position];
		position = position + 1;
		return fireplaceType;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}