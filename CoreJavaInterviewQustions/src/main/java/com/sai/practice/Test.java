package com.sai.practice;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

	String str = "ssaisrinivas22ssaismmetaakkldsp";

	HashMap<Character, Integer> charCount = new HashMap<>();

	char[] characters = str.toCharArray();

	for (char c : characters) {

	    if (charCount.containsKey(c)) {
		charCount.put(c, charCount.get(c) + 1);
	    } else {
		charCount.put(c, 1);
	    }
	}
	System.out.println(charCount);

    }
}
