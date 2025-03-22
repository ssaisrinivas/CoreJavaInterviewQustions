package com.sai.sdet.java.programs;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to get Armstrong Number !!");
	int number = sc.nextInt();
	armstrongNumber(number);
	sc.close();
    }

    public static void armstrongNumber(int number) {

	int givenNumber = number;
	int power = 0, result = 0, reminder = 0, powerValue = 0;
	power = number;
	while (power > 0) {
	    power = power / 10;
	    powerValue++;
	}

	while (number > 0) {
	    reminder = number % 10;
	    result += Math.pow(reminder, powerValue);
	    number = number / 10;
	}

	if (givenNumber == result) {
	    System.out.println("Given number " + givenNumber + " is an Armstrong Number !!!");
	} else {
	    System.out.println("Given number " + givenNumber + " is Not an Armstrong Number !!!");
	}
    }
}
