package objectAsArgumentInCOnstructor;

public class Student {
	String name;
	int roll;
	private Address address;
	
	public Student(Address a) {
		this.address=new Address("i am from address first");
		this.name="Shambhu";
		this.roll=7;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + "]";
	}


	public static void main(String[] array) {
		Student s = new Student(new Address("i am from address"));
		
	
		System.out.println(s);
	}
	

}
