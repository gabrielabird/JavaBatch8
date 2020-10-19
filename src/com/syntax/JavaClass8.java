package com.syntax;

import java.util.Scanner;

public class JavaClass8 {

	
	public static void main(String[] args) {
		// While Practice
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for your water");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if(money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
			}else {
				System.out.println("Water is expensive, please insert more money");
				money=input.nextInt();
			}
			money=input.nextInt();
		}
		System.out.println("Enjoy your water");
		
		
		
		
	}

}
