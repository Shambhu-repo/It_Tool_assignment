package headOffice;

import java.util.List;
import java.util.Map;

public class HeadOffice {
private String name;
private String locaiton;
private List<Map<String,Object>> regionalOffice;

public List<Map<String, Object>> getRegionalOffice() {
	return regionalOffice;
}
public void setRegionalOffice(List<Map<String, Object>> regionalOffice) {
	this.regionalOffice = regionalOffice;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocaiton() {
	return locaiton;
}
public void setLocaiton(String locaiton) {
	this.locaiton = locaiton;
}
@Override
public String toString() {
	return "HeadOffice [name=" + name + ", locaiton=" + locaiton + ", regionalOffice=" + regionalOffice + "]";
}


}
