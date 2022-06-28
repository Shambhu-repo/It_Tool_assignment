package com.assignment_16_FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReaderClass<E> implements ReaderClassInterface<Employee> {
	String filePath="src/com/assignment_16_FileHandling/emp.txt";

	@Override
	public List<Employee> getAllData() {
		List<Employee> emp = new ArrayList<Employee>();

		return emp;
		}
	
	public static List<Employee> getTextFromFile(String filePath) {
		List<Employee> empList = new ArrayList<Employee>();
		//String [] line1=new String[20];

		
		BufferedReader reader=null;
		
		try {
			
			reader = new BufferedReader(new FileReader(filePath));
			String line="";
			//line1 = line.split("");
			

			// line = reader.readLine();

			while ((line=reader.readLine())!= null) {
					System.out.println("This is reading all : " + line);


				//String line1 [] = line.split("\\|");
				String line1 [] = line.split(",");
				String id =  line1[0];
			    String name =	line1[1];
				String DeptId = line1[2];
				String doj = line1[3];
				 String salary1 = line1[4];
				    System.out.println("Salary " + DeptId);
				   // double salary = Double.parseDouble(salary1);
				    String designation = line1[5];
					 line = reader.readLine();

				    Employee emp = new Employee(Integer.parseInt(id),name,Integer.parseInt(DeptId),new Date(doj), Double.parseDouble(salary1),designation);
					empList.add(emp);
                 reader.lines();

				//for(int i=0;i<line1.length;i++) { 
				//String k =	line1[i];
				//System.out.println(k);
					//System.out.println("Hello" + line1[0]);
					
//					String id =  line1[0];
//				    String name =	line1[1];
//					String DeptId = line1[2];
//					String doj = line1[3];
//					
				//	Date date = new Date(doj);

//					SimpleDateFormat localDateFormat = new SimpleDateFormat("MMM dd yyyy");
//						String doj = line1[3];
//					    Date date=localDateFormat.parse(doj);
//					
//					    String salary1 = line1[4];
//					    System.out.println("Salary " + salary1);
//					   // double salary = Double.parseDouble(salary1);
//					    String designation = line1[5];
//					
//						line = reader.readLine();

//					    Employee emp = new Employee(Integer.parseInt(id),name,Integer.parseInt(DeptId),new Date(doj), Double.parseDouble(salary1),designation);
//					empList.add(emp);



			//	}

					 break;

						}
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
return empList;
		
	}
	
}
