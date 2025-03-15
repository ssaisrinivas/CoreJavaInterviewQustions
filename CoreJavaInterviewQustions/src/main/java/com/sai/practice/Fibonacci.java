package com.sai.practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the Fibonacci Sequence !!");
		int number = sc.nextInt();
		fibonacciSequence(number);
		sc.close();
	}

	public static void fibonacciSequence(int number) {

		int n1;
		int n2 = 0, n3 = 1;

		System.out.println("The Fibonacci Sequence of number");

		for (int i = 0; i <= number; i++) {
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			System.out.print(n1 + " ");
		}

	}
}
