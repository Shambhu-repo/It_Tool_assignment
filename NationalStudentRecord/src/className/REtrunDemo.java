package className;

public class REtrunDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		REtrunDemo rd = new REtrunDemo();
		//rd.getString();
		rd.getvalue();
				//System.out.println(n);
		
		

	}
	
	public String getString() throws InterruptedException  {
		String s = "hi Ram";
		String l = "hi shyam";
		String m="correct".concat(s).concat(l);
		
		for(int i=0;i<5;i++) {
			if(s.equals("hi ram")) {
				System.out.println("Hi ram is correct");
			break;
			
			}
			else {
				Thread.sleep(3000);
				return l;

			}
				
						
			}
		//}
		return "";
	}
	
	public void getvalue() throws InterruptedException {
		String s = getString();
		
		System.out.println(s);
		
	}
}



