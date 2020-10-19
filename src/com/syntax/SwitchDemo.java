package com.syntax;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
       
	
    	char grade;
    	String message;
    	Scanner inp;
        inp= new Scanner(System.in);
        System.out.println("Enter Grade");
        grade = inp.next().charAt(0);
        switch (grade) {
       
        case 'A':
            message = "Excellent";
            break;
        case 'B':
            message = "Good";
            break;
        case 'C':
        	message = "Average";
        	break;
        case 'D':
        	message = "Bad";
        	break;
       default: 
    	   message = " Not Acceptable";
        
   
        } System.out.println("Grade: " + message );
        
        // next

        
        Scanner input=new Scanner(System.in);
        String word1= null;
        String word2= null;
        int num1;
        int num2;
        System.out.println("Please enter two strings");
        word1=input.next();
        word2=input.next();
        System.out.println("Please enter two numbers");
        num1=input.nextInt();
        num2=input.nextInt();
        
        if(num1==num2 && word1.equals("num2"));
        
        //
            
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
    

