package com.sai.sdet.java.programs;

import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String to get Permutations !!");
	String string = sc.nextLine();
	vowelConsonantCount(string);
	sc.close();
    }
    
    public static void vowelConsonantCount(String str) {
    int vowel=0;
    int consonant=0;
    for(char c : str.toCharArray()) {
	if(c>='a' && c<='z') {
	    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		vowel++;
	    }
	    else {consonant++;}
	}
    }
    System.out.println("Vowels count is : " +vowel);
    System.out.println("Consonant count is : " +consonant);
}
}