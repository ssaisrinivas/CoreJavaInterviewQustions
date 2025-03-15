package com.sai.practice;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInAStringUsingSet
{

	public static void main(String[] args) {
		duplicateChar("lktdssgtpcc");
	}

	public static void duplicateChar(String str) {

		char[] charValue = str.toCharArray();

		Set<Character> set = new HashSet<Character>();
		Set<Character> duplicates = new HashSet<Character>();

		for (int i = 0; i < charValue.length; i++) {
			// set.add(charValue[i]);

			if (!(set.add(charValue[i]))) {

				duplicates.add(charValue[i]);
			}
		}

		System.out.println("Charaters in Set :" + duplicates);
	}
}
