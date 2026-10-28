import java.util.Scanner;

public class IT26102739Lab5Q3
{
	public static void main(String[]args)
	
	{
		Scanner input = new Scanner(System.in);
		
		//'final' - make sure that this value is constant at all times.
		final double roomCharge = 48000.0;
		
		//Input validation - to check if the Start date is within the given range.
		System.out.print("Enter the Start Date (1 - 31): ");
		int startDate = input.nextInt();
		
		//Input validation - to check if the End date is within the given range.
		System.out.print("Enter the End Date (1 - 31): ");
		int endDate = input.nextInt();
		
		//Both Start date & End date MUST BE within the given range.
		if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
			System.out.println("ERROR : Days must be between 1 and 31.");
		}
		//Start date MUST BE less than the End date.
		else if(startDate >= endDate){
			System.out.println("ERROR : Start date must be less than the End date.");
		}
		else{
			//To calculate the no.of days reserved
			int numOfDays = endDate - startDate;
			//To initialize the discount value,
			double discount = 0;
			
			System.out.println("\nRoom Charge Per Day: Rs. " + roomCharge + " /=");
			System.out.println("Number of days reserved: " + numOfDays);

			//No.of days reserverd = 3 - 4 days, Discount rate = 10%
			if(numOfDays >= 3 && numOfDays <= 4){
				// discount = 1-0.10 = 0.90,
				discount = 0.90;
			}
			//No.of days reserverd = 5 or more days, Discount rate = 20%
			else if(numOfDays >= 5){
				// discount = 1-0.20 = 0.80,
				discount = 0.80;
			}
			double toaltAmount = (numOfDays * roomCharge) * (discount);
			System.out.println("Total amount to be paid: " + toaltAmount);
		}
	}
}


		
		
		