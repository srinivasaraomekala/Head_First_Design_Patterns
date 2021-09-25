package com.designpatterns.iterator.fireplace;

import java.util.Arrays;
import java.util.List;

public class FireplaceApplication {
	public static void main(String args[]) {
		FireMenu pancakeHouseMenu = new ElectricFirePlaceMenu();
		FireMenu dinerMenu = new WoodFirePlaceMenu();

		FirePlaceSupplier waitress = new FirePlaceSupplier(pancakeHouseMenu, dinerMenu);

		// With iterators
		waitress.printMenu();

		printMenus();
	}

	/*
	 * Without the FirePlaceSupplier, we need the code below...
	 */
	public static void printMenus() {
		ElectricFirePlaceMenu electricMenu = new ElectricFirePlaceMenu();
		WoodFirePlaceMenu woodMenu = new WoodFirePlaceMenu();

		List<FirePlaceType> woodMenuTypes =woodMenu.getFireplaceTypes();
		FirePlaceType[] electricMenuTypes =  electricMenu.getFireplaceTypes();

		// print as Iterable
		printMenu(woodMenuTypes);
		printMenu(Arrays.asList(electricMenuTypes));

		// print with forEach
		System.out.println("=== forEach ===");
		woodMenuTypes.forEach(item -> System.out.println(item));
		Arrays.asList(electricMenuTypes).forEach(item -> System.out.println(item));
		System.out.println("=== forEach ===");

		// Using enhanced for loop
		System.out.println("USING ENHANCED FOR");
		for (FirePlaceType menuItem : woodMenuTypes) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getFirePlaceCost());
			System.out.println("\t" + menuItem.getDescription());
		}
		for (FirePlaceType menuItem : electricMenuTypes) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getFirePlaceCost());
			System.out.println("\t" + menuItem.getDescription());
		}

		// Exposing implementation
		System.out.println("USING FOR LOOPS");
		for (int i = 0; i < woodMenuTypes.size(); i++) {
			FirePlaceType menuItem = (FirePlaceType) woodMenuTypes.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getFirePlaceCost());
			System.out.println("\t" + menuItem.getDescription());
		}

		for (int i = 0; i < electricMenuTypes.length; i++) {
			FirePlaceType menuItem = electricMenuTypes[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getFirePlaceCost());
			System.out.println("\t" + menuItem.getDescription());
		}
	}

	public static void printMenu(Iterable<FirePlaceType> a) {
		for (FirePlaceType menuItem : a) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getFirePlaceCost());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
}
