package com.assignment_17;

public class Employee {
	
	private String record;
	
	

	public Employee(String record) {
		super();
		this.record = record;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return "Employee [record=" + record + "]";
	}
	
	
		

}
