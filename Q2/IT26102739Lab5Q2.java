import java.util.Scanner;

public class IT26102739Lab5Q2
{
	public static void main(String[]args)
	
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int members = input.nextInt();
		
		//Input validation - to see if the entered value is negative.
		if(members < 0){
			System.out.println("Input must be a number 0 or greater");
		}
		//Input validation - to determine the prize from the entered value.
		else{
			switch(members){
				case 0: 
					System.out.print("No prize");
					break;
				case 1:
					System.out.print("Prize is a : Pen");
					break;
				case 2:
					System.out.print("Prize is a : Umbrella");
					break;
				case 3:
					System.out.print("Prize is a : Bag");
					break;
				case 4: 
					System.out.print("Prize is a : Travelling chair");
					break;
				// For 5 or more new members, the prize is a Headphone.
				default : 
					System.out.print("Prize is a : Headphone");
					break;
			}
		}
	}
}
