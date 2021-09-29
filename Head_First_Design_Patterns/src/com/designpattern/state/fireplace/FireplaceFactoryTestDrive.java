package com.designpattern.state.fireplace;

public class FireplaceFactoryTestDrive {

		public static void main(String[] args) {
			FireplaceFactory fireplaceFactory = 
				new FireplaceFactory(5);

			System.out.println(fireplaceFactory);

			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();
			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();

			System.out.println(fireplaceFactory);

			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();
			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();

			System.out.println(fireplaceFactory);

			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();
			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();

			System.out.println(fireplaceFactory);

			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();
			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();

			System.out.println(fireplaceFactory);

			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();
			fireplaceFactory.insertFireplace();
			fireplaceFactory.depotFireplace();

			System.out.println(fireplaceFactory);
		}
	}
