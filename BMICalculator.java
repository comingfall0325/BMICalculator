package day4;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your height in meter");
		double height = scanner.nextDouble();
		
		System.out.println("Enter your weight in pounds");
		double weightInPounds = scanner.nextDouble();
		
		double weightInKilogram = weightInPounds * 0.45359237;
		
		double bmi = weightInKilogram / (height * height);
		
		System.out.println("Your BMI is: " + bmi);
		
		if (bmi <= 18.5)
			System.out.println("Your are underweight.");
		if (bmi > 18.5 && bmi <= 24.9)
			System.out.println("Your are healthy.");
		if (bmi > 24.9 && bmi <= 29.9)
			System.out.println("Your are overweight.");	
		if (bmi > 29.9)
			System.out.println("Your are obesity.");
		
		scanner.close();
	}

}
