package com.veilu;

import java.util.Scanner;

public class Main {

	// function to checkPalindrome

	public void checkPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ********** Enter number to be checked if it is Palindrome or not *********** \n");
		int num = sc.nextInt();
		int originaNum = num;
		int reversedNum = 0, remainder = 0;

		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;
		}
		if (originaNum == reversedNum) {
			System.out.println(originaNum + " is a Palindrome number.");
		} else {
			System.out.println(originaNum + " is not a Palindrome number.");
		}

	}

	// function to printPattern

	public void printPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ********** Enter te number of rows/levels to print patterns*********** \n");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ********** Enter the number to be checked if it is Prime or not*********** \n");
		int num = sc.nextInt();
		boolean flag = false;

		for (int i = 2; i <= num / 2; i ++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(num + " is a not prime number.");
		else
			System.out.println(num + " is a prime number.");
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ********** Enter the limit for fibonacci series *********** \n");
		int num = sc.nextInt();
		int count =0;
		while(count < num) {
			System.out.print(first + " ");
			int num3 = first + second;
			first = second;
			second = num3;
			count = count + 1;
		}
		System.out.print("\n");
	}

	// main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
