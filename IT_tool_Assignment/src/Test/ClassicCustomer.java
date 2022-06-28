package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassicCustomer  implements ClassicInterface {
	double purchase;  // first 10%  // input
	double purchase2;  // it is for adding each item price
	double purchase3;  //  third 20%
	double purchase1; // 15%
	double purchase4; // 10%  not sure

	double discount; // for adding
	double discount1;  // for 15%
	double discount2;    // 20%
	double discount3;// 10%
	
	double bill;
	double bill1; // for 15%
	double bill2; // for 20%
	static int itemNo;

	Scanner scan = new Scanner(System.in);

	public  void ClassicDiscountAndBill() {
		System.out.println("Please Enter your purchase Amount or Scan Prodcut BarCode");
		purchase = purchase + scan.nextDouble();
		if(purchase>=1 && purchase<10001 || purchase>=10001 && purchase<20001 || purchase>20000) {
        if	(purchase>20000){
			//purchase3=purchase2-purchase-purchase1;
			purchase3=purchase-20000;
			  discount2=purchase3*20/100;
			  discount+= discount2 ;  //+discount1;
			   bill2 = purchase3-discount2;
			   bill+=bill2;
			   
			System.out.println("Purchase Amount  purchase>20000:" + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		
				}
			
			else if(purchase>=10001 && purchase<20001 || purchase>20000){
				purchase1=purchase-10000;
				discount1=purchase1*15/100;
				discount=discount+discount1;
	            
				bill1 = purchase1-discount1;
				bill=bill+bill1;
				purchase2+=purchase1;

				System.out.println("Purchase Amount 10000-20000: " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	

			
				
				
			}
			
			discount3=(purchase-purchase1-purchase3)*10/100;
             discount=discount3+discount1+discount2; // no need
			bill = purchase-discount;
			purchase2+=purchase;
			System.out.println("Purchase Amount  1-10000 : " + purchase + " Bill amount : " + bill + " discount : " + discount);		 	
		}

itemNo++;
		System.out.println("You Scanned Item No : " + itemNo);

	}

		
	

		
}



