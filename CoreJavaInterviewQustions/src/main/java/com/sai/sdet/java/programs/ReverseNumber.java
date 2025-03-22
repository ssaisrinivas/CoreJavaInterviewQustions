package com.sai.sdet.java.programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to get Reverse Number !!");
	int number = sc.nextInt();
	reverseNumber(number);
	sc.close();
    }

    public static void reverseNumber(int number) {
	int num = number;
	int rev = 0;
	while (number > 0) {
	    int temp = number % 10;
	    rev = rev * 10 + temp;
	    number = number / 10;
	}

	System.out.println("Reverse of the given " + num + " is :" + rev);
    }

}
