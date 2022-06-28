package Constructor;

public class ChildClass extends PareentClass{
	 int age;
	 String name;
	 String address;
	 int wardNo;
	 int salary;
	
	public ChildClass(int age , String name ,String add, int ward, int salary) {
	    super(age,name);
		this.address=add;
		this.wardNo=ward;
		this.salary=salary;
		System.out.println("child constructior 1 : " + age + " "+ name + " " + add + " " +ward +" " +  salary);
	}

	public ChildClass(int age1, String name1) {
		super(age1, name1);
		System.out.println("child constructior 2 : " + age1 + " " + name1);
	}
	
	
	public void getAllINfo() {
		ChildClass cc = new ChildClass(age,name,address,wardNo,salary);
		System.out.println("Child class get all info : " + cc);
	}
		
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ChildClass [age=" + age + ", name=" + name + ", address=" + address + ", wardNo=" + wardNo + ", salary="
				+ salary + "]";
	}
	
	

}
