package com.syntax.class01;

import java.util.Scanner;

public class AaBbCc {

	
	public static void main(String[] args){
	     Scanner input = new Scanner(System.in);
	     int score;
	     String grade = null;
	     System.out.println("Please enter your mark");
	     score = input.nextInt();
	     if(score>=1 && score<25){
	       grade = "Your grade is F";
	     }else if(score>=25 && score<45){
	       grade = "Your grade is E";
	     }else if(score>=45 && score<50){
	       grade = "Your grade is D";
	     }else if(score>=50 && score<60){
	       grade = "Your grade is C";
	     }else if(score>=60 && score<80){
	       grade = "Your grade is B";
	     }else if(score>80){
	       grade = "Your grade is A";
	     }else{
	        grade = "Please enter valid mark";
	     }
	     System.out.print(grade);
	   }
	
}


;