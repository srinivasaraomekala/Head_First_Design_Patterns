package com.designpatterns.abstractfactory;

public class FireStoreApplication {

	public static void main(String[] args) {
		FireStore fireStore =new FireStore();
		Fire fire = fireStore.placeFire("wood");
		System.out.println(fire.toString());
	}

}
