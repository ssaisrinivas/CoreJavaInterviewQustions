package com.sai.practice;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the Even or Odd ?");
		int number = sc.nextInt();
		checkNumberEvenOrOdd(number);
		sc.close();
	}

	public static void checkNumberEvenOrOdd(int number) {

		if (number % 2 == 0) {
			System.out.println("Given Number is Even :");
		}
		else
			System.out.println("Given Number is Odd :");
	}

}
