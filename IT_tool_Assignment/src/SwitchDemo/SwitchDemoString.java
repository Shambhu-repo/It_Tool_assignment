package SwitchDemo;

public class SwitchDemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SwitchDemoString sd = new SwitchDemoString();
		String month ="feb";
		int montsh= SwitchDemoString.returnMonth(month);
		System.out.println(montsh);
	}
	
	public static int returnMonth(String month) {
		int monthNumber =0;
		if(month==null) {
			return monthNumber;
		}
		switch(month.toLowerCase()) {
		
		case "jan" : 
			monthNumber=1;
			break;
			
		case "feb" : 
			monthNumber=2;
			break;
			
		case "mar" : 
			monthNumber=3;
			break;
		
		}
		
		return monthNumber;
		
	}

}