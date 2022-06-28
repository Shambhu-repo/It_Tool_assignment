package Test;

public class PlataniumDiscount {
	
	public double discountAmount(double purchase) {
		double discountAmount = 0.00;
		
		if(purchase>20000.00) {
			discountAmount = ((purchase-20000.00)*.4)+(10000.00*.35)+(10000.00*.3);
		}
		
		else if(purchase >10000.00 && purchase <=20000.00) {
			discountAmount =((purchase - 10000.00)*.35)+(10000.00*.3);
		}
		
		else if(purchase >1.00 && purchase<=10000.00) {
			discountAmount = (purchase*.3);
		}
		
		else if(purchase<0) {
			
		}
		return discountAmount;
	}

}
