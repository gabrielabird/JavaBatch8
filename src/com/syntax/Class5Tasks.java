package com.syntax;
import java.util.Scanner;
public class Class5Tasks {

	public static void main(String[] args) {
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		Scanner scan=new Scanner(System.in);
		
		
		Scanner input;
		int num = 0; 
		num=scan.nextInt();
	
		if (num>0 && num<60) {
			System.out.println("Youreheight is short");
			
		}else if (num>60 && num<72) {
			System.out.println("Youre height is med"); 
			
		}else if (num>72) {
			System.out.println("YOure height is tall");
				
			
			//Task2
			
			
			int quiz, mid, finaL,avg;
			
			scan = new Scanner(System.in);
			
			
			System.out.println("Enter quiz score");
			quiz = scan.nextInt();
			
			System.out.println("Enter mid term score");
			mid = scan.nextInt();
			
			System.out.println("Enter final score");
			finaL=scan.nextInt();
			
			avg=(quiz + mid+ finaL)/3;
			System.out.println(avg);
			
			if(avg>=90) {
				System.out.println("Grade A");
			}else if (avg>=70 && avg<=90) {
				System.out.println("Grade B");
			}else if (avg>=60 && avg<=70) {
				System.out.println("Grade C");
			}else if (avg>=40 && avg<=60) {
				System.out.println("You fail");
				System.out.println("You need to study more");
			}

		
		 
		}
	}

}
