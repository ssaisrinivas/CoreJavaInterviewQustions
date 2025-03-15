package com.sai.practice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check the Palindrom string or not !!");
		String str = sc.next();
		palindromString(str);
		sc.close();
	}

	public static void palindromString(String str) {
		String  reverse = "" ;		
		for(int i=str.length()-1;i>=0;i--) {			
			 reverse+= str.charAt(i);		
		}
	

		if(reverse.equals(reverse))    
			   System.out.println("palindrome String ");    
			  else    
			   System.out.println("not palindrome String");  		
	}	
	
}
