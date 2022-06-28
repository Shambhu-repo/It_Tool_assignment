package com.assignment_4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		sc.close();

		int i = 2;
		boolean flag = false;
		while (i <= num / 2) {

			// checking Non prime Number
			if (num % i == 0) {
				flag = true;
				break;
			}

			++i;
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

	}

}
