package com.regularExpressionInJava;


import java.util.regex.Pattern;
public class RegularExpression2 {
// Video 11 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// \s = any white space character , short for [\t\n\xOB\f\r] ,       \S = any non-whitespace character, short for [^\s]
		
System.out.println(" A1 = " + Pattern.matches("\\s","") );// false , no white space in expected string
System.out.println(" A2 = " + Pattern.matches("\\s","\n") );// true , only one whitespace come
System.out.println(" A3 = " + Pattern.matches("\\s"," ") );// true only one white space
System.out.println(" A4 = " + Pattern.matches("\\s","\f") );// true one lne white space
System.out.println(" A5 = " + Pattern.matches("\\s","  ") );// false motre than one white space
System.out.println(" A6 = " + Pattern.matches("\\s","\t\t") );// false , more than one white space come
System.out.println(" A7 = " + Pattern.matches("\\s","ab ") );// false  only one white space but with char , not expecting
System.out.println(" A8 = " + Pattern.matches("\\s","ab") );// false , no whitespace
System.out.println(" A88 = " + Pattern.matches("\\s+","\n\n") ); //true

System.out.println(" A9 = " + Pattern.matches("\\s*","        ") );// true, morethan one whitespace can come
System.out.println(" A10 = " + Pattern.matches("\\s*","\t\t") );// true, morethan one whitespace can come

// Non white space
System.out.println(" A11 = " + Pattern.matches("\\S","a") );//  true, not  white space 
System.out.println(" A12 = " + Pattern.matches("\\S","\n") );// false ,  one whitespace come
System.out.println(" A13 = " + Pattern.matches("\\S"," ") );// false ,  white space
System.out.println(" A14 = " + Pattern.matches("\\S","\f") );// false  , white space
System.out.println(" A15 = " + Pattern.matches("\\s","  ") );// false ,   white space
System.out.println(" A16 = " + Pattern.matches("\\s","\t\t") );// false ,  white space come
System.out.println(" A17 = " + Pattern.matches("\\s","ab ") );// false  white space not expecting
System.out.println(" A18 = " + Pattern.matches("\\s","ab") );// false , no whitespace but morethan one char

System.out.println(" A19 = " + Pattern.matches("\\S*","peter") );// true, non white space character come multiple time 
System.out.println(" A20 = " + Pattern.matches("\\S*","\t\t") );// false,  whitespace 

//  \w = any word character, short for [a-zA-Z_0-9] ,     \W = Any non-word character , short for [^\w]
System.out.println(" A21 = " + Pattern.matches("\\w","p") ); // true ,
System.out.println(" A22 = " + Pattern.matches("\\w*","9") );// true
System.out.println(" A23 = " + Pattern.matches("\\w","_") ); // true
System.out.println(" A24 = " + Pattern.matches("\\w","@") ); // false
System.out.println(" A25 = " + Pattern.matches("\\w*","peter_99")); // true
System.out.println(" A26 = " + Pattern.matches("\\w*","peter_99@") ); // false

System.out.println(" A27 = " + Pattern.matches("\\W","@") ); // true ,
System.out.println(" A33 = " + Pattern.matches("\\W*","@#!&*^$~") ); // true ,

System.out.println(" A28 = " + Pattern.matches("\\W*","9") );// false
System.out.println(" A29 = " + Pattern.matches("\\W","_") ); // false
System.out.println(" A30 = " + Pattern.matches("\\W","a") ); // false
System.out.println(" A31 = " + Pattern.matches("\\W*","peter_99")); // false
System.out.println(" A32 = " + Pattern.matches("\\W*","peter_99@") ); // false

// AlphaNumeric demo
System.out.println(" Matches A33 :"+ Pattern.matches("[0-9a-zA-Z]{4}", "ju33"));// ture , aphaNumeric must be 4
System.out.println(" Matches A34 :"+ Pattern.matches("[0-9a-zA-Z]{4}", "jui34"));// false
System.out.println(" Matches A35 :"+ Pattern.matches("[0-9a-zA-Z]{7}", "jui309"));// false : it should be 7 number of alphaNumeric quantity
System.out.println(" Matches A36 :"+ Pattern.matches("[0-9a-zA-Z$]{7}", "jui309$"));//true

	}

}
