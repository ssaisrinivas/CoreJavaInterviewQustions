package com.sai.sdet.java.programs;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to get the Factorial !!");
	int number = sc.nextInt();
	factorial(number);
	sc.close();
    }

    public static void factorial(int number) {
	int temp = 1;
	for (int i = number; i >= 1; i--) {
	    temp = temp * i;
	    System.out.print(i + "*");
	}
	System.out.println();
	System.out.println("Factorial number is : " + temp);
    }

}
