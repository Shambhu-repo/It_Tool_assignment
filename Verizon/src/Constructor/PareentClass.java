package Constructor;

public class PareentClass {
	int age ;
	String name;
	
	public PareentClass(int age12 , String name12) {
		this.age=age12;
		this.name=name12;
		System.out.println("from PareentClass constructor " + age + " " + name);
	}
	
	public static void demoHo() {
		System.out.println("From demoHo method");
	}
	
	

}
