package com.designpattern.state.offerfireplace;

import java.util.ArrayList;

public abstract class RewardBuilder {

		State state1;
		ArrayList<State> state = new ArrayList<State>();
		public abstract RewardBuilder hasOrderState();
		public abstract RewardBuilder noOrderState();
		public abstract RewardBuilder soldState();
		public abstract RewardBuilder soldoutState();
		public abstract RewardBuilder rewardState();

		public FireplaceOrder build() {
			FireplaceOrder fireplaceOrder = new FireplaceOrder();
			fireplaceOrder.getState();
			//fireplaceOrder.addIngredients(ingredients);
			return fireplaceOrder;
		}
	}