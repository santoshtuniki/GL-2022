import java.util.Scanner;

public class Main {
	
	//function to checkPalindrome
	public void checkPalindrome(int number) {
	   	int value = number;
		int sum = 0;		
		
		while(value>0) {
			int remainder = value % 10;			
			sum = sum * 10 + remainder;			
			value = value / 10;
		}
		
		if(sum==number) {
			System.out.println("Yes, "+ number +" is a Palindrome. \n");
		} else {
			System.out.println(number+" is not a Palindrome! \n");
		}
	}
		
	//function to printPattern
	public void printPattern(int number) {
		if(number>0) {
	   		for (int i=number; i>=1; i--) {
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
	   	} else {
	   		System.out.println("enter a valid no! \n");
	   	}
	}
	    
	//function to check no is prime or not
	public void checkPrimeNumber(int number) {	    	
    		if(number==1) {
    			System.out.println("1 is neither Prime nor Composite. \n");
    		} else {
    			boolean flag = false;
    			for(int i=2; i<number; i++) {
    				if(number%i==0) {
    					flag = true;
    					break;
    				}
    			}
    			if(!flag) {
    				System.out.println(number + " is a Prime number. \n");
    			} else {
    				System.out.println(number + " is not a Prime number. \n");
    			}
    		}
   	 }

	// function to print Fibonacci Series
	public void printFibonacciSeries(int number) {
	    int n1 = 0, n2 = 1, n3 = 0;
	    if (number == 0) {
	    	System.out.println("The Fibonacci series is: "+ n1);
	    } else if (number == 1) {
	    	System.out.println("The Fibonacci series is: "+ n1 + ", " + n2);
	    } else {
	    	int count = number;
		   	System.out.print("The Fibonacci series is: "+n1+", "+n2);
		   	while(count>1) {
		   		n3 = n1 + n2;
		   		System.out.print(", "+n3);
		   		n1 = n2;
		   		n2 = n3;
		   		count--;
		   	}
	    }
	    System.out.println("\n");
	}
	    
	//main method which contains switch and do while loop
	public static void main(String[] args) {    	
		Main obj = new Main();
	   	 int choice, number;
	    	Scanner sc = new Scanner(System.in);
	    
	  	do {   			    		
	    		System.out.println("Enter your choice from below list.\n" + 
			"1. Find palindrome of number.\n" + "2. Print Pattern for a given no.\n" + 
			"3. Check whether the no is a  prime number.\n" + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			
			System.out.println();
			
			choice = sc.nextInt();
		
			switch (choice) {
			
				case 0:				
					choice = 0;					
					break;		
					
				case 1: 
				{
					System.out.println("Enter a number to check if it is a palindrome \n");
			    		number = sc.nextInt();
					obj.checkPalindrome(number);
				}			
				break;		
				 		
				case 2: 
				{
					System.out.println("Enter a number to print the pattern.\n");
				   	number = sc.nextInt();
					obj.printPattern(number);
				}			
				break;
				
				case 3: 
				{
					System.out.println("Enter a number to check whether it is a prime no \n");
				   	number = sc.nextInt();
					obj.checkPrimeNumber(number);
				}			
				break;			 
				
				case 4: 
				{
					System.out.println("Enter a number to print the Fibonacci series of the number.\n");
			    		number = sc.nextInt();
					obj.printFibonacciSeries(number);
				}			
				break;	
			
				default:
				System.out.println("Invalid choice. Enter a valid no.\n");	
			}	
		} while (choice != 0);
			
		System.out.println("Exited Successfully!!!");				
		sc.close();			
	}		
}