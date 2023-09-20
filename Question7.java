package task8;

import java.util.Scanner;

public class Question7 {
	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        
	        String userInput = sc.nextLine();

	        int length = userInput.length();
	        System.out.println("The length of the string is: " + length);

	        sc.close();
	    }
	}



