package Test;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myval = null; 
		String		mystr = (myval==null) ?"":myval.substring(0, 5);
		System.out.println( " this is from 1st " + mystr + " myval first " + myval);
		if(mystr.equals("")) {
			try {
				System.out.println("String1 is empty");
}
			catch(Exception e) {
				e.getMessage();
			}
		}
		else {
			System.out.println("String1 is : " + mystr);
		}
		myval="helloSarkar";
		mystr=(myval==null)?"":myval.substring(0,6);
		if(mystr.equals("")) {
			System.out.println("string2 is empty 2");
		}
		else {
			System.out.println("String2 myval " + mystr);
		}

	}

}
