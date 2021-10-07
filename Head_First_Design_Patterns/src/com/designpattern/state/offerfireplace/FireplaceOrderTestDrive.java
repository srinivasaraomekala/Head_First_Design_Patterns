package com.designpattern.state.offerfireplace;

public class FireplaceOrderTestDrive {

	public static void main(String[] args) {
		FireplaceOrder fireplaceOrder = new FireplaceOrder(5);

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		
		
		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();
		

		System.out.println(fireplaceOrder);

		fireplaceOrder.orderFireplace();
		fireplaceOrder.dispatchFireplace();
		fireplaceOrder.deliverFireplace();

		System.out.println(fireplaceOrder);
	}
}
