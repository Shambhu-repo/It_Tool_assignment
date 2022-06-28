package com.assignment_9_a;

import java.util.Scanner;

public class ClassicCustomer   implements CustomerInterface {

	
	public double discountAndBill(double purchase) {
	    double	discount =0.00;
		
		if(purchase>20000.00) {
			discount = ((purchase-20000.00)*.2)+(10000.00*.15)+(10000.00*.1);
		}
		
		else if(purchase >10000.00 && purchase <=20000.00) {
			discount =((purchase - 10000.00)*.2)+(10000.00*.1);
		}
		
		else if(purchase >1.00 && purchase<=10000.00) {
			discount= (purchase*.1);
		}
		
		else if(purchase<0) {
			System.out.println("Sorry no Transaction made");
			
		}
		return discount;
	}
	
	

	
		
		
	
	

}
