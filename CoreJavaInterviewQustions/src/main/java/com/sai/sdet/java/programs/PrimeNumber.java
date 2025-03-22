package com.sai.sdet.java.programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to check Prime Number !!");
	int number = sc.nextInt();

	boolean prime = primeNumberOrNot(number);
	if (prime) {
	    System.out.println("The number is a Prime Number !!!");

	} else {
	    System.out.println("The number is a Not a Prime Number !!!");
	}
	System.out.println();
	primeNumber(number);
    }

    public static boolean primeNumberOrNot(int number) {

	for (int i = 2; i <= number / 2; i++) {
	    if (number % i == 0) {
		return true;
	    }
	}
	return false;
    }

    public static void primeNumber(int number) {
	for (int i = 2; i <= number; i++) {
	    if (number % i == 0) {
		System.out.println();
		System.out.println("Number " + number + " can be divisible with ::" + i);

	    } else {
		System.out.println();
		System.out.println("Number " + number + " can Not be divisible with ::" + i);
	    }
	}
    }
}
