package com.assignment_9_a_complex;

public class MasterCustomer {
	private Double purchase;
	
	public MasterCustomer() {}

	public Double getPurchase() {
		return purchase;
	}

	public void setPurchase(Double purchase) {
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		return "MasterCustomer [purchase=" + purchase + "]";
	}

	
}
