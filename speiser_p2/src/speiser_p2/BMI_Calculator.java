package speiser_p2;
import java.util.Scanner;

public class BMI_Calculator {
	public static void main (String [] args) {
		
		Scanner userData = new Scanner (System.in);
		
		double weight, height, bmiVal;
		int choice;
		boolean exit = false;
		
		do {
			System.out.println("Welcome to the BMI (Body Mass Index) calculator!");
			System.out.println("Select Choice: ");
			System.out.println("1. Use Pounds/Inches");
			System.out.println("2. Use Kilograms/Meters");
			System.out.println("3. Exit");
			choice = userData.nextInt();
		
		switch (choice) {
		
			case 1:
				System.out.print("Please Enter Your Weight in lbs: ");
				weight = userData.nextDouble();
				System.out.print("Please Enter Your Height in inches: ");
				height = userData.nextDouble();
				bmiVal = (703 * weight) / (height * height);
				System.out.printf("Your BMI is: %.2f\n\n", bmiVal);
				
				System.out.println("BMI VALUES");
				System.out.println("Underweight: less than 18.5");
				System.out.println("Normal:      between 18.5 and 24.9");
				System.out.println("Overweight:  between 25 and 29.9");
				System.out.println("Obese:       30 or greater");
				
				exit = true;
				break;
			case 2: 
				System.out.print("Please Enter Your Weight in kilograms: ");
				weight = userData.nextDouble();
				System.out.print("Please Enter Your Height in meters: ");
				height = userData.nextDouble();
				bmiVal = (weight) / (height * height);
				System.out.printf("Your BMI is: %.2f\n\n", bmiVal);
				
				System.out.println("BMI VALUES");
				System.out.println("Underweight: less than 18.5");
				System.out.println("Normal:      between 18.5 and 24.9");
				System.out.println("Overweight:  between 25 and 29.9");
				System.out.println("Obese:       30 or greater");
				
				exit = true;
				break;
			case 3: 
				System.out.print("Exiting Program. \n");
				
				exit = true;
				break;
			default: 
				System.out.println("Invalid Input: Returning to the Main Menu. \n ");
				
				break;
		
			}
		} while (!exit);
		
		
		
		
	}

}
