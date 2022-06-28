package com.assignment_16_FileHandling;

public class Department implements Comparable<Department> {
	
	private int deptId;
	private String deptName;
	private String address;
	private String deptHead;
	
	
	
	public Department(int deptId, String deptName, String address, String deptHead) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.address = address;
		this.deptHead = deptHead;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", address=" + address + ", deptHead="
				+ deptHead + "]";
	}
	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
