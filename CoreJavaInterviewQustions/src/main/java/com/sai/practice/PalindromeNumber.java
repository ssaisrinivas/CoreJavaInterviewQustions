package com.sai.practice;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the Palindrom number !!");
		int number = sc.nextInt();
		palindromNumber(number);
		sc.close();
	}

	public static void palindromNumber(int number) {
		int temp=number;		
		int sum=0;		
		while(number>0) {
			
			int x=number%10;			
			sum=(sum*10)+x;				
			number=number/10;
		}
		
		System.out.println(sum);
		
		if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
		
		
	}

}
