package com.designpatterns.command.fireplace;

public class FirePlace {

	public static void main(String[] args) {
		ConstructFireplace constructFireplace = new ConstructFireplace();
		FireplaceFactory fireplaceFactory = new FireplaceFactory();
		Customer customer = new Customer(fireplaceFactory);
		customer.createOrder(new FixFireplace(constructFireplace));
		customer.Fireit();
	}

}