package com.designpatterns.iterator.fireplace;

public class FirePlaceSupplier {
	FireMenu electricFirePlaceMenu;
	FireMenu woodFirePlaceMenu;
 
	public FirePlaceSupplier(FireMenu electricFirePlaceMenu, FireMenu woodFirePlaceMenu) {
		this.electricFirePlaceMenu = electricFirePlaceMenu;
		this.woodFirePlaceMenu = woodFirePlaceMenu;
	}
 
	public void printMenu() {
		Iterator electricFirePlaceIterator = electricFirePlaceMenu.createIterator();
		Iterator woodFirePlaceIterator = woodFirePlaceMenu.createIterator();

		System.out.println("MENU\n----\nELECTRIC");
		printMenu(electricFirePlaceIterator);
		System.out.println("\nWOOD");
		printMenu(woodFirePlaceIterator);

	}
 
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			FirePlaceType menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getFirePlaceCost() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
 
	public void printVegetarianMenu() {
		printVegetarianMenu(electricFirePlaceMenu.createIterator());
		printVegetarianMenu(woodFirePlaceMenu.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator breakfastIterator = electricFirePlaceMenu.createIterator();
		if (isVegetarian(name, breakfastIterator)) {
			return true;
		}
		Iterator dinnerIterator = woodFirePlaceMenu.createIterator();
		if (isVegetarian(name, dinnerIterator)) {
			return true;
		}
		return false;
	}


	private void printVegetarianMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			FirePlaceType menuItem = iterator.next();
			if (menuItem.isFireTypeWood()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getFirePlaceCost());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			FirePlaceType menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isFireTypeWood()) {
					return true;
				}
			}
		}
		return false;
	}
}
