package com.sai.sdet.java.programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to get the Fibnocci Series !!");
	int number = sc.nextInt();
	printFibnocciSeries(number);
    }

    public static void printFibnocciSeries(int number) {

	int first = 0;
	int second = 1;
	int next;

	for (int i = 0; i < number; i++) {

	    System.out.println(first + " ");
	    next = first + second;
	    first = second;
	    second = next;

	}

    }

}