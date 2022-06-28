package RegionalOffice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionalOffice {
	private String name;
	private String address;
	private List<Map<String,Object>> districtOffice;
	
	public Map getRegionalOffice() {
//		List<Map<String,Object>> obj = new ArrayList<Map<String,Object>>(); 
//		List<RegionalOffice> regionalOffice1= new ArrayList<RegionalOffice>();
		Map<String,Object> regional=new HashMap<String,Object>();
		regional.put("western1","western1");
		regional.put("western2","western2");
		regional.put("western3","western");
		regional.put("western4","western");
		regional.put("western5","western");
		return regional;
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
	public List<Map<String, Object>> getDistrictOffice() {
		return districtOffice;
	}
	public void setDistrictOffice(List<Map<String, Object>> districtOffice) {
		this.districtOffice = districtOffice;
	}
	@Override
	public String toString() {
		return "RegionalOffice [name=" + name + ", address=" + address + ", districtOffice=" + districtOffice + "]";
	}

}
