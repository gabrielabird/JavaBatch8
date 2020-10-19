package com.syntax;
import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		

		
		//Task2
		//Write a program to ask user to enter numbers of worked years and annual salary. 
		//If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
		Scanner scan;
		double years;
		int  salary;
		 
		 scan=new Scanner(System.in);
		 System.out.println("How many years have you worked?");
		years=scan.nextDouble(); 
		
		if(years>=5) {
		System.out.println("Youre eligible for the bonus ");
		 System.out.println("What is your salary?");
		salary=scan.nextInt(); 
		if(salary>=5000) {
			System.out.println("Your bonus is $5000");
		}else { 
			System.out.println("Your bonus is $3000");
		}
		}else {
			System.out.println("Sorry, youre not eligible for a bonus");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
