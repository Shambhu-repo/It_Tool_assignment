package Test;

import java.util.Scanner;

public class Simulator {
	
	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		
		PlataniumDiscount pltDis = new PlataniumDiscount();
		double totalPurchase = 0.00;
		System.out.println("Enter Purchase: ");
		double purchaseAmount = scaner.nextDouble();
		totalPurchase = totalPurchase+purchaseAmount;
		double discount = pltDis.discountAmount(totalPurchase);
		System.out.println("Discount: "+discount);
		System.out.println("Billing Amount: "+(totalPurchase-discount));
	}

}
// 3000 + 3500 + 4000
// 7000 = 700
// 12000 = 