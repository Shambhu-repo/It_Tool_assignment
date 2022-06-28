package It_Tool_Assignment;

public class Human { 
	String name;
	int age;
	
	public Human() {  // This constructor is used for first five object with no parameter
		
	}
public Human(String name, int age) { // this is for  other way or with parameter
		
		this.name = name;
		this.age = age;
	}
public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "Alex";
		h1.age=29;
		System.out.println("name:  "+h1.name+ " Age : "+ h1.age );
		
		Human h2 = new Human();
		h2.name="Nemar";
	    h2.age=29;
		System.out.println("name:  "+h2.name+ " Age : "+ h2.age );
		
		Human h3 = new Human();
		h3.name="Messi";
		h3.age=35;
		System.out.println("name:  "+h3.name+ " Age : "+ h3.age );
		
		Human h4 = new Human();
		h4.name="Ronaldo";
		h4.age=34;
		System.out.println("name:  "+h4.name+ " Age : "+ h4.age );
		
		Human h5 = new Human();
		h5.name="Messi";
		h5.age=35;
		System.out.println("name:  "+h5.name+ " Age : "+ h5.age );
		
		// Other way
		Human h6 = new Human("Sita", 20);
		System.out.println("name :" + h6.name+ " age : "+ h6.age );
}

}
