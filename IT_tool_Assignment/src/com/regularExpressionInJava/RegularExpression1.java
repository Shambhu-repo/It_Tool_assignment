package com.regularExpressionInJava;

import java.util.regex.Pattern;

public class RegularExpression1 {

	public static void main(String[] args) {
String expected = "Thresholding";
System.out.println("[a-zA-Z] matches A1 = "+ Pattern.matches("[a-zA-Z]", "A"));
System.out.println("[a-zA-Z] matches A2 = "+ Pattern.matches("[a-zA-Z]?", "A"));
System.out.println("[a-zA-Z] matches A3 = "+ Pattern.matches("[a-zA-Z]+", "A"));
System.out.println("[a-zA-Z] matches A4 = "+ Pattern.matches("[a-zA-Z]*", "bihar is good but no development A"));
System.out.println("[a-zA-Z] matches A5 = "+ Pattern.matches("[a-zA-Z]{3,7}", "A"));
System.out.println("[a-zA-Z] matches A44 = "+ Pattern.matches("[a-zA-Z\\s]*", "bihar is good but nodevelopmentA")); // true
System.out.println("[a-zA-Z] matches A45 = "+ Pattern.matches("[a-zA-Z]+[\\s]+","biharisgoodbutnodevelopmentA"));  //false


System.out.println("[a-zA-Z] matches A6 = "+ Pattern.matches("[a-d[m-p]]", "a"));  // a to d and m to p 
System.out.println("[a-zA-Z] matches A7 = "+ Pattern.matches("[a-d[m-p]]", "am"));


System.out.println(" A8 = " + Pattern.matches(".r", "ar"));  // true (2nd char is r )
System.out.println(" A9 = " + Pattern.matches(".r", "ak"));  // false (2nd char is not r )
System.out.println(" A10 = " + Pattern.matches(".r", "arrrr"));  // false (has morethan 2 char )
System.out.println(" A11= " + Pattern.matches("....r", "paaar"));  // true ( 5th char is r)
System.out.println(" A12= " + Pattern.matches("..r", "par"));  // true ( 3rd char is r)

//Regex character class
System.out.println("[^abc] matches A13 = " + Pattern.matches("[^abc]", "ab")); // this is false becuase it is within abc not outof abc
System.out.println("[^abc] matches A14 = " + Pattern.matches("[^abc]", "zxy")); // false morethan one character
System.out.println("[^abc] matches A15 = " + Pattern.matches("[^abc]", "x"));  // true , its not a ,b and c so it is true

//
System.out.println("[a-z&&[def]] mathces A16 " + Pattern.matches("[a-z&&[def]]", "d") );  // true , it is a to z but should be in between d to f 
System.out.println("[a-z&&[^def]] mathces A18 " + Pattern.matches("[a-z&&[^def]]", "d") ); // false , it is a to z but should avoid d to f
System.out.println("[a-z&&[^def]] mathces A17 " + Pattern.matches("[a-z&&[^def]]", "p") ); // true , it is a to z but should avoid d to f

// Regex quantifiers  : X? = x occurs once or not at all , X+ = X occurs once or mote times , X* = X occurs zero or more timesPa
System.out.println("A19 " + Pattern.matches("[ab]?","a") );  // true a or b comes one timee
System.out.println("A20 " + Pattern.matches("[ab]?","") );  // true a or b comes one timee or not at all
System.out.println("A21 " + Pattern.matches("[ab]?","aab") );  // false a comes more than one timee


System.out.println("A22 " + Pattern.matches("[ab]+","a") );  // true a or b comes one or more timee
System.out.println("A23 " + Pattern.matches("[ab]+","") );  // false a or b comes at least one or more time
System.out.println("A24 " + Pattern.matches("[ab]+","aab") );  // true a comes more than one timee
System.out.println("A25 " + Pattern.matches("[ab]+","aabz") );  // false because z is not matching pattern

System.out.println("A26 " + Pattern.matches("[ab]*","a") );  // true a or b comes zero or more timee
System.out.println("A27 " + Pattern.matches("[ab]*","") );  // true a or b comes zero  or more time
System.out.println("A28 " + Pattern.matches("[ab]*","aab") );  // true a and be  comes zero or more than one timee
System.out.println("A29 " + Pattern.matches("[ab]*","aabz") );  // false because z is not matching pattern

// X{n} = x occurs n times , X{n,} = x occurs n or moretime , X{y,z} = X occurs atleast y times but less than or equal to z times 
System.out.println(" A30 :  " + Pattern.matches("a{3}", "aaa"));  // true , a occurs 3 times
System.out.println(" A31 :  " + Pattern.matches("a{3}", "aa"));  // false , a should occurs 3 times
System.out.println(" A32 :  " + Pattern.matches("a{3}", "bbb"));  // false pattern should match firs

System.out.println(" A30 :  " + Pattern.matches("a{3,}", "aaa"));  // true , a occurs 3 times
System.out.println(" A31 :  " + Pattern.matches("a{3,}", "aa"));  // false , a should occurs minimum 3 times
System.out.println(" A32 :  " + Pattern.matches("a{3,}", "bbb"));  // false pattern should match firs

System.out.println(" A33 :  " + Pattern.matches("a{3,6}", "aaa"));  // true , a should  occurs minimum 3 times and less or equal to 6 times
System.out.println(" A34 :  " + Pattern.matches("a{3,6}", "aaaaa"));  // true , a should  occurs minimum 3 times and less or equal to 6 times
System.out.println(" A35 :  " + Pattern.matches("a{3,6}", "bbb"));  // false pattern should match firs

// Regex meta characters : . = any character ( may or may not match terminatior) , \d = any digit , short of [0-9] , \D = any non-digit , short for [^0-9]

System.out.println("A36 : " + Pattern.matches("\\d","9")); // true ( digit and comes once)
System.out.println("A37 : " + Pattern.matches("\\d","dfg")); // false ( non digit)
System.out.println("A38 : " + Pattern.matches("\\d","9998")); // false ( digit but more than  once)
System.out.println("A39 : " + Pattern.matches("\\d","9acd")); // false ( digit and char)
System.out.println("A40 : " + Pattern.matches("\\d*","90998878")); // true ( digit and digit can occur zero or morethan one time)

System.out.println("A41 : " + Pattern.matches("\\D","m")); // true ( char and comes once)
System.out.println("A42 : " + Pattern.matches("\\D","dfg")); // false ( more than one chart)
System.out.println("A43 : " + Pattern.matches("\\D","9")); // false ( digit can not accept)
System.out.println("A44 : " + Pattern.matches("\\D","9acd")); // false ( digit and char)
System.out.println("A45 : " + Pattern.matches("\\D*","Hello")); // true ( non digit can occur zero or morethan one time)

System.out.println("A41 : " + Pattern.matches(".","m")); // true ( char and comes once)
System.out.println("A42 : " + Pattern.matches(".","8")); // true ( more than one chart)
System.out.println("A43 : " + Pattern.matches(".","99")); // false ( digit or char more than one)
System.out.println("A46 : " + Pattern.matches(".*","9b")); // true , can be zero or more than zero occurance


	}

}
