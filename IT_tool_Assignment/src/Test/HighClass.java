package Test;

import java.util.Scanner;

public class HighClass  {
	double purchase;  // first 10%
	double purchase2;  // it is for adding each item price
	double purchase3;  //  third 20%
	double purchase1; // 15%

	double discount; // for 10%
	double discount1;  // for 15%
	double discount2;    // 20%
	
	double bill;
	double bill1; // for 15%
	double bill2; // for 20%
	static int itemNo;

	Scanner scan = new Scanner(System.in);

	public  void ClassicDiscountAndBill() {
		System.out.println("Please Enter your purchase Amount or Scan Prodcut BarCode");
		purchase = purchase + scan.nextDouble();
		if(purchase>=1 && purchase<=10000) {
			discount =purchase*10/100;
			bill = purchase-discount;
			purchase2+=purchase;
			System.out.println("Purchase Amount : " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		}
		//from 10001 to 20000
		else if(purchase-10000<=10000) {
			
			purchase1=purchase-purchase2;
			discount1=purchase1*15/100;
			discount=discount+discount1;
            
			bill1 = purchase1-discount1;
			bill=bill+bill1;
			purchase2+=purchase1;

			System.out.println("Purchase Amount : " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		}
		//above 40000
		else if(purchase-20000<=20000 ) {
			  purchase3=purchase-purchase2;
			  discount2=purchase3*20/100;
			  discount =discount+discount2;
			   bill2 = purchase3-discount2;
			   bill+=bill2;
			   
			System.out.println("Purchase Amount :" + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		
		}

		itemNo++;
		System.out.println("You Scanned Item No : " + itemNo);

	}
	
	
	public  void PlatiniumDiscountAndBill() {
		System.out.println("Please Enter your purchase Amount or Scan Prodcut BarCode");
		purchase = purchase + scan.nextDouble();
		if(purchase>=1 && purchase<=10000) {
			discount =purchase*30/100;
			bill = purchase-discount;
			purchase2+=purchase;
			System.out.println("Purchase Amount : " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		}
		//from 10001 to 20000
		else if(purchase-10000<=10000) {
			
			purchase1=purchase-purchase2;
			discount1=purchase1*35/100;
			discount=discount+discount1;
            
			bill1 = purchase1-discount1;
			bill=bill+bill1;
			purchase2+=purchase1;

			System.out.println("Purchase Amount : " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		}
		//above 40000
		else if(purchase-20000<=20000 ) {
			  purchase3=purchase-purchase2;
			  discount2=purchase3*40/100;
			  discount =discount+discount2;
			   bill2 = purchase3-discount2;
			   bill+=bill2;
			   
			System.out.println("Purchase Amount :" + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		
		}

		itemNo++;
		System.out.println("You Scanned Item No : " + itemNo);

	}
	
	
	public  void GoldDiscountAndBill() {
		System.out.println("Please Enter your purchase Amount or Scan Prodcut BarCode");
		purchase = purchase + scan.nextDouble();
		if(purchase>=1 && purchase<=10000) {
			discount =purchase*20/100;
			bill = purchase-discount;
			purchase2+=purchase;
			System.out.println("Purchase Amount : " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		}
		//from 10001 to 20000
		else if(purchase-10000<=10000) {
			
			purchase1=purchase-purchase2;
			discount1=purchase1*25/100;
			discount=discount+discount1;
            
			bill1 = purchase1-discount1;
			bill=bill+bill1;
			purchase2+=purchase1;

			System.out.println("Purchase Amount : " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		}
		//above 40000
		else if(purchase-20000<=20000 ) {
			  purchase3=purchase-purchase2;
			  discount2=purchase3*30/100;
			  discount =discount+discount2;
			   bill2 = purchase3-discount2;
			   bill+=bill2;
			   
			System.out.println("Purchase Amount :" + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		
		}

		itemNo++;
		System.out.println("You Scanned Item No : " + itemNo);

	}
	
	
}
