package task8;

	import java.util.Scanner;

	public class Question10 {
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        
	        long number = scanner.nextLong();
	        
	        int digitCount = countDigits(number);
	        
	        System.out.println("Number of digits: " + digitCount);
	        
	        scanner.close();
	    }
	    
	    public static int countDigits(long number) {
	        
	        number = Math.abs(number);
	        
	        int count = 0;
	        
	        while (number > 0) {
	        	
	            number /= 10;
	            count++;
	            
	        }
	        
	        return count;
	    }
	}
