package com.sai.sdet.java.programs;

import java.util.Scanner;

public class StringPermutations {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String to get Permutations !!");
	String string = sc.nextLine();
	stringPermutations(string ,"");
	sc.close();
    }
    
    public static void stringPermutations(String str,String prefix) {
		
	if(str.length()==0) {
	    System.out.println(prefix);
	}
	else {
	    
	    for(int i=0;i<str.length();i++) {
		String rem = str.substring(0,i)+str.substring(i+1);
		stringPermutations(rem,prefix+str.charAt(i));
	    }
	}
	
	
    }
}
