package com.assignment_15_String;

import java.util.Scanner;

public class ContainOrNot {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your main string");
		String webapple =	scan.nextLine().replaceAll("\\s", "");  // removing all white space 
		
		System.out.println("Please enter your sub-string");
		
		String apple =	scan.nextLine().replaceAll("\\s", "");  // removing all white space  
		
		scan.close();
		


	    
	    char[] webappleArray = webapple.toCharArray();
	    char[] appleArray = apple.toCharArray();
	
	    System.out.println(isPresent(appleArray, webappleArray));

	    System.out.println(" webappleArray : " +webappleArray.length+ " apple Array :" + appleArray.length);
	}

	public static boolean isPresent(char[] apple, char[] webapple) {
	    for (int i = 0; i < webapple.length - apple.length+1; i++) {
	        for (int j = 0; j < apple.length; j++) {
	        	
	        	System.out.println("j index: " + j);
        		System.out.println("i index : " + i);

	        	if (webapple[i + j] == apple[j]) {
	            	
	            	System.out.println(webapple[i + j] + " :" + apple[j]);
            		
	            	System.out.println(apple.length-1);
            		System.out.println("j index: " + j);
            		System.out.println("i index : " + i);



	            	if (j == apple.length - 1) {
	            		System.out.println(apple.length-1);
	                    
	                	return true;
	                }
	            } else {
	                break;
	            }
	            
	            
	        }
	    }
	    return false;
	}

}
