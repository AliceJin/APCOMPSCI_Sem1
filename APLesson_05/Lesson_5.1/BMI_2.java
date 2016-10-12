import java.util.Scanner;
public class BMI_2
{
	static double weight;
	static double height;
	static double bmi;
	static String condition = ""; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Welcome to the BMI Calculator!");
		System.out.println("Please enter your weight in pounds: ");
		weight = kb.nextDouble();
		System.out.println("Please enter your height in inches: ");
		height = kb.nextDouble();
		
		//call method
		calcBMI();
		
		//print output
		System.out.printf("Your BMI is: %2.1f\n", bmi);
		System.out.printf("You are %s.\n", condition);
	}
	
	public static void calcBMI()
	{
		bmi = (weight / (height * height)) * 703; 
		if (bmi < 18.5)
			condition = "Underweight";
		else if (bmi < 24.9)
			condition = "Normal";
		else if (bmi < 29.9)
			condition = "Overweight";
		else if (bmi < 34.9)
			condition = "Obese";
		else if (bmi < 39.9)
			condition = "Very Obese";
		else
			condition = "Morbidly Obese";
	}
}