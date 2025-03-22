package com.sai.sdet.java.programs;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to get Reverse Each Word !!");
	String string = sc.nextLine();
	reverseEachWordOfString(string);
	sc.close();
    }

    static void reverseEachWordOfString(String inputString) {
	String[] words = inputString.split(" ");
	String reverseString = "";
	for (int i = 0; i < words.length; i++) {
	    String word = words[i];
	    String nstr = "";
	    char ch;
	    for (int j = 0; j < word.length(); j++) {
		ch = word.charAt(j);
		nstr = ch + nstr;
	    }
	    reverseString = nstr + " " + reverseString;
	}
	System.out.println(inputString);
	System.out.println(reverseString);
    }
}
