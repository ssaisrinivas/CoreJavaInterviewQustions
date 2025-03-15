package com.sai.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the factorial !!");
		int number = sc.nextInt();
		factorialofaNumber(number);
		sc.close();
	}

	public static void factorialofaNumber(int number) {

		int sum = 1;
		for (int i = 1; i <= number; i++) {

			sum *= i;
		}

		System.out.println("The Factorial of number" + number + " is :" + sum);

	}
}
