package com.designpatterns.iterator.fireplace;

public class ElectricFirePlaceMenu implements FireMenu{
	static final int MAX_FIRE_PLACES = 3;
	int numberOfFirePlaces = 0;
	FirePlaceType[] firePlaceTypesMenu;

	public ElectricFirePlaceMenu() {
		firePlaceTypesMenu = new FirePlaceType[MAX_FIRE_PLACES];
		addItem("Electric-1 Fire Place", "Electric type 1 ", 2.99);
		addItem("Electric-2 Fire Place", "Electric type 2 ", 2.99);
		addItem("Electric-3 Fire Place", "Electric type 3 ", 2.99);
	}

	public void addItem(String fireplacename, String description, double price) {
		FirePlaceType firePlace = new FirePlaceType(fireplacename, description, price);
		if (numberOfFirePlaces >= MAX_FIRE_PLACES) {
			System.err.println("Sorry, firplace cart is full!  Can't add more!!");
		} else {
			firePlaceTypesMenu[numberOfFirePlaces] = firePlace;
			numberOfFirePlaces = numberOfFirePlaces + 1;
		}
	}

	public FirePlaceType[] getFireplaceTypes() {
		return firePlaceTypesMenu;
	}

	public Iterator createIterator() {
		return new FireplaceArrayIterator(firePlaceTypesMenu);
	}
	
	public String toString() {
		return "Electric Fire Place Menu";
	}

}
