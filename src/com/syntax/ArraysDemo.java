package com.syntax;

public class ArraysDemo {

	public static void main(String[] args) {
		// Arrays=
		
		int a=10;
		a=20;
		
		//int stu1=90;
		//int stu2=97;
		//int stu3=85;
		//etc
		
		
		int [] num= new int [5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//access elements from an array?
		System.out.println("access 3rd element" +num[2]);
		
		
		//add
		System.out.println(num[1]+num [4]);
		
		//change 50 to 100;
		num[4]=100;
		System.out.println("value of 5th element after changing " +num[4]);
		
		int[]array1=new int [2];
		//array[0]=10.99; CE:type of value must be integer
		
		String[] array=new String[4];
		array[0]="Hello";
		System.out.println(array[0]);
		
		//  Class 10 
		//task 1
		
		char[]grade=new char[4];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		System.out.println(grade[1]);
		
		//task 2

		String[]name= {"Gaby", "Juan", "Danny", "David"};
		System.out.println(name[3]);
		
	
		       
		 
		}
	}
