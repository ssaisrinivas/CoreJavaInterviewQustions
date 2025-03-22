package com.sai.sdet.java.programs;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to check Even or Odd !!");
	int number = sc.nextInt();

	checkOddEven(number);

    }

    static void checkOddEven(int number) {

	if (number % 2 == 0) {
	    System.out.println("Even Number !!!");
	} else {
	    System.out.println("Odd Number !!!");
	}
    }

}
