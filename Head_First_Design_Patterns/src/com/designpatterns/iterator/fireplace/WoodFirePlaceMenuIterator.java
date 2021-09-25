package com.designpatterns.iterator.fireplace;

import java.util.List;

public class WoodFirePlaceMenuIterator implements Iterator {
	List<FirePlaceType> items;
	int position = 0;

	public WoodFirePlaceMenuIterator(List<FirePlaceType> items) {
		this.items = items;
	}

	public FirePlaceType next() {
		/*
		 * FireplaceType item = items.get(position); position = position + 1; return
		 * item;
		 */
		// or shorten to:
		return items.get(position++);
	}

	public boolean hasNext() {
		/*
		 * if (position >= items.size()) { return false; } else { return true; }
		 */
		// or shorten to:
		return items.size() > position;
	}
}
