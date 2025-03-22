package com.sai.sdet.java.programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to get Reverse String !!");
	String string = sc.nextLine();
	reverseString(string);
	sc.close();
    }

    public static void reverseString(String givenString) {

	String ss = givenString;
	char[] c = ss.toCharArray();
	String nstr = "";

	for (int i = c.length - 1; i >= 0; i--) {
	    nstr = nstr + c[i];
	}
	System.out.println(nstr);

    }
}