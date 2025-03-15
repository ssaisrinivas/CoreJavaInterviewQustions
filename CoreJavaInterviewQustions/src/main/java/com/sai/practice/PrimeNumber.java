package com.sai.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to know the prime numbers between !!");
		int initialNum = sc.nextInt();
		int finalNum = sc.nextInt();
		List<Number> primeNumberList = primeNumbersBetween(initialNum, finalNum);
		System.out.println("Prime Numbers are :");
		for (Number number : primeNumberList) {
			System.out.println(number);
		}
		
		int  highest = Integer.MIN_VALUE;
		System.out.println(highest);
		sc.close();

	}

	public static List<Number> primeNumbersBetween(int initialNum, int finalNum) {

		List<Number> primeNumberList = new ArrayList<Number>();
		for (int i = initialNum; i <= finalNum; i++) {
			boolean isprimecheck = isPrime(i);
			if (isprimecheck) {
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}

	static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
