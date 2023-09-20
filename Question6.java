package task8;

import java.util.Scanner;

public class Question6 {
		
	    public static void main(String[] args) {
	    	
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a non-negative integer: ");
	        int number = input.nextInt();

	        long factorial = calculateFactorial(number);
	        System.out.println("The factorial of " + number + " is " + factorial);

	        input.close();
	    }

	    public static long calculateFactorial(int num) {
	    	
	        if (num < 0) {
	            throw new IllegalArgumentException("Factorial is defined for non-negative integers.");
	        }
	        
	        long factorial = 1;
	        
	        for (int i = 2; i <= num; i++) {
	            factorial *= i;
	        }
	        
	        return factorial;
	    }
	}


