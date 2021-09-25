package com.designpatterns.iterator.fireplace;

import java.util.ArrayList;

public class FireplaceListIterator implements Iterator  {
	ArrayList<FirePlaceType> items;
	int position = 0;
 
	public FireplaceListIterator(ArrayList<FirePlaceType> items) {
		this.items = items;
	}
 
	public FirePlaceType next() {
		FirePlaceType item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}