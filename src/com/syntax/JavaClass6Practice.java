package com.syntax;
import java.util.Scanner; 
public class JavaClass6Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Sunday";
		
		if(!(day.equals("Sunday")&& day.equals("Saturday"))) {
			System.out.println("I'll go to work");
			
			//TASK1
			
		
			
			boolean isSale=true;
			double price=150;
			
			if (isSale) {
				System.out.println("SHOPPING");
				System.out.println("Original price is $300");
				
			}else if (price>50) {
				price = price * 1.5;
				System.out.println("Sale price is " +price);
			}else if (price>50 && price<200)
				price = price * 2.5;
				System.out.println("Sale price is $ " +price);
				
		} else
			System.out.println("No shopping");
			
		
		
		//Switch Statement
		System.out.println("-----same example using switch case------");
		String today;
		
		switch (day) {//data type of variable must match data type of cases
		
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		default:
			today = "Invalid";
			break;
		}
	System.out.println("Today is " + today);
		
		
		}
			
		
				
			}
		
		
		
		
		
		
	}


