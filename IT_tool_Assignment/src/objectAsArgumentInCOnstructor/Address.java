package objectAsArgumentInCOnstructor;

public class Address {
	String city;
	String wardNo;
	
public Address(String s) {
	s="i am from address";
	this.city="Simara";
	this.wardNo="2";
	System.out.println("finding employee address");
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getWardNo() {
	return wardNo;
}

public void setWardNo(String wardNo) {
	this.wardNo = wardNo;
}

@Override
public String toString() {
	return "Address [city=" + city + ", wardNo=" + wardNo + "]";
}

}
