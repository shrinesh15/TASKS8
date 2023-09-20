package task8;

import java.util.Scanner;


public class Question9 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        int seniorCitizenAge = 60; 

	        if (age >= seniorCitizenAge) {
	        	
	            System.out.println("You are a senior citizen.");
	        } 
	        
	        else {
	        	
	            System.out.println("You are not a senior citizen.");
	        }

	        sc.close();
	    }
	}

