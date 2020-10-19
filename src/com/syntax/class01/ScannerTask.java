package com.syntax.class01;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		// Homework1

		Scanner input = new Scanner(System.in);

		System.out.println("What is the amount for the loan?");

		int loan = input.nextInt();

		if (loan <= 200000) {
			System.out.println(" I will lend the money ");
		} else {
			System.out.println(" I will not lend the money ");
		}

		System.out.println("-----------------Homework2-----------------");

		// Homework2

		System.out.println("How old are you?");

		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("I will issue you a DL");
		} else {
			System.out.println(" You will get a LP");
		}
		
		
			


			System.out.println("---------------Homework3---------------------");

			// Homework3

			System.out.println("Input your city name and temperature");
			String City;
			City = input.next();

			System.out.println("Input your temperature");
			float f;
			f = input.nextFloat();

			double cel;
			cel = (f - 32) / 1.8;

			System.out.println("The temperature in " + City + " is " + cel);

		}

	}

