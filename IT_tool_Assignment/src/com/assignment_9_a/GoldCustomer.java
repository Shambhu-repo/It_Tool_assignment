package com.assignment_9_a;

public class GoldCustomer implements CustomerInterface{
	
	public double discountAndBill(double purchase) {
	    double	discount =0.00;
		
		if(purchase>20000.00) {
			discount = ((purchase-20000.00)*.3)+(10000.00*.25)+(10000.00*.2);
		}
		
		else if(purchase >10000.00 && purchase <=20000.00) {
			discount =((purchase - 10000.00)*.3)+(10000.00*.2);
		}
		
		else if(purchase >1.00 && purchase<=10000.00) {
			discount= (purchase*.2);
		}
		
		else if(purchase<0) {
			System.out.println("Sorry no Transaction made");
			
		}
		return discount;
	}


	
}
