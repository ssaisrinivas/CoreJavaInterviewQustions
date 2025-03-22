package com.sai.sdet.java.programs;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String to get Palindrome or not !!");
	String string = sc.nextLine();
	boolean val = palindromeString(string);
	if (val) {
	    System.out.println("Given Palindrom String !!");
	} else {
	    System.out.println("Not a Palindrom String !!!");
	}
	sc.close();
    }

    public static boolean palindromeString(String str) {
	int start = 0;
	int end = str.length() - 1;
	while (start < end) {
	    if (str.charAt(start) != str.charAt(end)) {
		return false;
	    }
	    start++;
	    end--;
	}
	return true;

    }
}
