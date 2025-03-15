package com.sai.practice;

public class Test {

	public static void main(String[] args) {

		occeranceOfCharecter("Sai srinivas");
	}

	public static void occeranceOfCharecter(String str) {

		char[] str1 = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1.length; j++) {

				if (str1[i] == str1[j]) {
					count++;
				}
			}
			System.out.println("Charecter   " + str1[i] + " Count is :  " + count);
			count = 0;
		}
	}

}
