package mahi;
import java.util.Scanner; 

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 3 digit number");
		
		// Reading the input 
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		// Checking for 
		if (num<=1000){
		int n=num;
		// Initializing the variables
		int reverse= 0; int rmd;
		// logic for palindrome
		do{
			rmd = num%10;
			reverse=reverse*10+ rmd;
			num= num/10;
		}while(num>0);
		// Checking for palindrome Number
		if (n==reverse){
			System.out.println("Given number is palindrome");
			
		}
		else{
			System.out.println("Given number is not a polindrome");
		}
		}
		else{
			System.out.println("Given number is not a 3 digit number");
		}
	}

}

// OUTPUT 
/* Enter a 3 digit number
123
Given number is not a polindrome 
Enter a 3 digit number
121
Given number is palindrome */
