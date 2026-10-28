import java.util.Scanner;

public class IT26102739Lab5Q1
{
	public static void main(String[]args)
	
	{	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int num3 = input.nextInt();
		
		// Initialize the smallestNum & largestNum
		int smallestNum = num1;
		int largestNum = num1;
		
		//computing smallest numbers
		if(num1 < num2){
			smallestNum = num1;
		}
		if(num2 < num3){
			smallestNum = num2;
		}
		if(num3 < num1){
			smallestNum = num3;
		}
		//computing largest numbers
		if(num1 > num2){
			largestNum = num1;
		}
		if(num2 > num3){
			largestNum = num2;
		}
		if(num3 > num1){
			largestNum = num3;
		}
		
		//Printing the results in one line
		System.out.println("\nUser entered numbers are: " + num1 + " " + num2 + " " + num3);
		System.out.println("The Smallest number is: " + smallestNum);
		System.out.println("The Largest number is: " + largestNum);
	}
}
		
		