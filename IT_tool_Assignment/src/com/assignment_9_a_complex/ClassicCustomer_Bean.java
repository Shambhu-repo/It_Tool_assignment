package com.assignment_9_a_complex;

public class ClassicCustomer_Bean {
	private double purchase;
	
	public ClassicCustomer_Bean() {}

	public double getPurchase() {
		return purchase;
	}

	public void setPurchase(double purchase) {
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		return "ClassicCustomer_Bean [purchase=" + purchase + "]";
	}
	
	

}
