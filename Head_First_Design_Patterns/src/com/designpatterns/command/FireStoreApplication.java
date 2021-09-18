package com.designpatterns.command;

import java.util.Scanner;

public class FireStoreApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t***************Welcome to Fire Store***************\n\tPlease choose the one of the below options!!!");
		System.out.println("\t>> GAS_FIRE\n\t>> WOOD_FIRE\n\t>> ELECTRIC_FIRE");
		System.out.println("\t***************Enter your option here!!***************");
		System.out.print("\t");
		String userChoice = sc.next().toUpperCase();
		FireStore fireStore =new FireStore();
		Fire fire=null;
		if(userChoice.equalsIgnoreCase(FireConstants.GAS_FIRE) || userChoice.equalsIgnoreCase(FireConstants.ELECTRIC_FIRE)) {
			fire= fireStore.createFire(userChoice);
		}else if(userChoice.equalsIgnoreCase(FireConstants.WOOD_FIRE)) {
			System.out.println("\t***************Please choose one of the below flavoured wood***************");
			System.out.println("\t>> DriftWood \n\t>> OakTreeWood \n\t>> FruitTreeWood");
			System.out.println("\t***************Enter your wood option here!!***************");
			System.out.print("\t");
			String woodType = sc.next().toUpperCase();
			fire = fireStore.createFire(userChoice,woodType);
		}
		System.out.println(fire.toString());
		System.out.println("\t***************THANK YOU!!***************");
		sc.close();
		
	}

}
