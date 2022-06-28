package com.assignment_16_FileHandling;

public class TextClass extends ReadFromFile {
	
	
	
	public Object[] givemeObject() {
		//text = readTextFile(filepath);
		String filepath = "src/com/assignment_16/file.txt";
		String [] t = readTextFile(filepath).split("\\s");

		//String [] t = text.split("//s");
		
				
		Employee[] emp = new Employee[5];
		
		int i=0;
		while(t!=null) {
		String name =	t[0];
		String address = t[1];
		String position = t[2];
		String dateOfBirth = t[3];
		String dateOfJoininng= t[4];
			
//			emp[i]= new Employee(name,address, position , dateOfBirth, dateOfJoininng);
//			i++;
			
		}
		
		
		
		
		
		
		
		return emp;
	}

}
