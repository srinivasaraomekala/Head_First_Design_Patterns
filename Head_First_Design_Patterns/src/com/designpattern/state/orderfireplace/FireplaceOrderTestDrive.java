package com.designpattern.state.orderfireplace;

public class FireplaceOrderTestDrive {

	public static void main(String[] args) {
		FireplaceOrder fireplaceOrder = new FireplaceOrder(4);

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		//fireplaceOrder.installFireplace();
		
		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		//fireplaceOrder.installFireplace();

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		//fireplaceOrder.installFireplace();

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		//fireplaceOrder.installFireplace();

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		//fireplaceOrder.installFireplace(); */

		System.out.println(fireplaceOrder);
	}
}
