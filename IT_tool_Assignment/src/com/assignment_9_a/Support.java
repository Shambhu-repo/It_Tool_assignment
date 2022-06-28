package com.assignment_9_a;

import java.util.Scanner;

public class Support {
public static	Scanner scan = new Scanner(System.in);

	
	public static  void printBill() {
		
		   CustomerInterface ci = null;
		  
		   double purchase=0;
			double discount=0;
			double bill=0;
			
			System.out.println("Please Enter your purchase");
	         purchase= scan.nextDouble();
	         
	         if(DriverClass.option==1) {
			ci=new ClassicCustomer();
			discount =ci.discountAndBill(purchase);
         bill=purchase-discount;
		}
		else if(DriverClass.option==2) {
			ci=new PlatiniumCustomer();
         discount =ci.discountAndBill(purchase);
         bill=purchase-discount;
}
		else if(DriverClass.option==3) {
			ci=new GoldCustomer();
         discount =ci.discountAndBill(purchase);
        bill=purchase-discount;

			
		}

		
System.out.println("Purchase Amount :" + purchase + " Discount "+ discount + " Bill "+ bill);
		
		
	}
	
	public static void initialization() {
		System.out.println("Please pick one of the given Option:");
		System.out.println("**************************************************************");
		System.out.println("**************************************************************");
		System.out.println("Enter : <1> for PLatinium\nEnter : <2> for Classic\nEnter : <3> for Golden"
				+ "\nEnter <0> for Exit");
	}
	
	public static void byeBye() {
		System.out.println("**************************************************************");
		System.out.println("**************************************************************");
        System.out.println("Vsit again! Bye Bye!! ");
		System.out.println("**************************************************************");
		System.out.println("**************************************************************");


	}
	
	


}
