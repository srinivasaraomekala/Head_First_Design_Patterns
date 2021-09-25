package com.designpatterns.iterator.fireplace;

import java.util.ArrayList;
import java.util.List;

public class WoodFirePlaceMenu implements FireMenu {
	List<FirePlaceType> fireplaceTypes;

	public WoodFirePlaceMenu() {
		fireplaceTypes = new ArrayList<FirePlaceType>();

		addItem("WoodFirePlace-1", " Type 1 wood ", 2.99);

		addItem("WoodFirePlace-2", " Type 2 wood ", 5.99);

		addItem("WoodFirePlace-3", " Type 3 wood ", 3.49);

	}

	public void addItem(String name, String description, double price) {
		FirePlaceType FireplaceType = new FirePlaceType(name, description, price);
		fireplaceTypes.add(FireplaceType);
	}

	public List<FirePlaceType> getFireplaceTypes() {
		return fireplaceTypes;
	}

	public Iterator createIterator() {
		return new WoodFirePlaceMenuIterator(fireplaceTypes);
	}

	public String toString() {
		return "Wood Fire Place Menu";
	}

}
