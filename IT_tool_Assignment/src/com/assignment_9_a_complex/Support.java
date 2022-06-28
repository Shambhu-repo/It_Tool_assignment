package com.assignment_9_a_complex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Support {
	public static	Scanner scan = new Scanner(System.in);
	
	public static double purchase=0.00;
	public static double acutualPurchase=0.00;
	public static double totalDiscount=0.00;
	public static double totalBill=0.00;

	public static double acutualPurchase1=0.00;
	public static double purchase1=0.00;

	public static double acutualPurchase2=0.00;
	public static double purchase2=0.00;

	public static List<ClassicCustomer_Bean> totalPurchase = null;
	public static ClassicCustomer_Bean ccBean =null;

	public static List<PlatiniumCustomer_Bean> totalPurchase1 = null;
	public static PlatiniumCustomer_Bean pcBean =null;

	public static List<GoldCustomer_Bean> totalPurchase2 = null;
	public static GoldCustomer_Bean gcBean =null;

	public  static List< ClassicCustomer_Bean> addPurchase() {
		totalPurchase=new ArrayList<ClassicCustomer_Bean>();
		ccBean= new ClassicCustomer_Bean();

		System.out.println("Please Scan your product");
		purchase =scan.nextDouble();
		acutualPurchase+=purchase;

		ccBean.setPurchase(acutualPurchase);
		totalPurchase.add(ccBean);

		for(ClassicCustomer_Bean add:totalPurchase) {
			purchase=add.getPurchase();
		}


		return totalPurchase;
	}

	public  static List< PlatiniumCustomer_Bean> addPurchase1() {
		totalPurchase1=new ArrayList<PlatiniumCustomer_Bean>();
		pcBean= new PlatiniumCustomer_Bean();

		System.out.println("Please Scan your product");
		purchase1 =scan.nextDouble();
		acutualPurchase1+=purchase1;

		pcBean.setPurchase(acutualPurchase1);
		totalPurchase1.add(pcBean);

		for(PlatiniumCustomer_Bean add:totalPurchase1) {
			purchase1=add.getPurchase();
		}

		return totalPurchase1;
	}

	public  static List<GoldCustomer_Bean> addPurchase2() {
		totalPurchase2=new ArrayList<GoldCustomer_Bean>();
		gcBean= new GoldCustomer_Bean();

		System.out.println("Please Scan your product");
		purchase2 =scan.nextDouble();
		acutualPurchase2+=purchase2;

		gcBean.setPurchase(acutualPurchase2);
		totalPurchase2.add(gcBean);

		for(GoldCustomer_Bean add :totalPurchase2) {
			purchase2=add.getPurchase();
		}


		return totalPurchase2;
	}

	
	public static  void printBill1() {

		switch(DriverClass.option) {   // i want to use application as a master aplication which works for multiple payment desk
		case 1: addPurchase();  //  classicCustomer();
		break;
		case 2:addPurchase1();  //  Platinium
		break;
		case 3: addPurchase2();   // Gold 
		}
	}

	public static void printBill() {
		printBill1();

		CustomerInterface ci = null;

		double discount=0;
		double bill=0;

		if(DriverClass.option==1) {
			ci=new ClassicCustomer();

			discount =ci.discountAndBill(purchase);
			totalDiscount=discount;
			bill= (purchase-totalDiscount);
			totalBill=bill;
			System.out.println("Purchase Amount :" + purchase + " Discount "+ totalDiscount + " Bill "+ totalBill);

		}
		else if(DriverClass.option==2) {
			ci=new PlatiniumCustomer();
			discount =ci.discountAndBill(purchase1);
			totalDiscount=discount;
			bill= (purchase1-totalDiscount);
			totalBill=bill;
			System.out.println("Purchase Amount :" + purchase1 + " Discount "+ totalDiscount + " Bill "+ totalBill);


		}
		else if(DriverClass.option==3) {
			ci=new GoldCustomer();

			discount =ci.discountAndBill(purchase2);
			totalDiscount=discount;
			bill= (purchase2-totalDiscount);
			totalBill=bill;
			System.out.println("Purchase Amount :" + purchase2 + " Discount "+ totalDiscount + " Bill "+ totalBill);

		}
}



	public static void initialization() {
		System.out.println("Please pick one of the given Option:");
		System.out.println("**************************************************************");
		System.out.println("**************************************************************");
		System.out.println("Enter : <1> for Classic\nEnter : <2> for Platinium\nEnter : <3> for Golden"
				+ "\nEnter <0> for Exit");
	}

	public static void byeBye() {
		System.out.println("**************************************************************");
		System.out.println("**************************************************************");
		System.out.println("*************Vsit again! Bye Bye!!*************** ");
		System.out.println("**************************************************************");
		System.out.println("**************************************************************");
}
}
