import java.util.Scanner; //import scanner

public class BMI_calc
{
	public static void main(String [] args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the BMI Calculator!");
		System.out.println("Please enter your weight in pounds: ");
		
		//store user input
		int weight = keyboard.nextInt();
		
		System.out.println("\nPlease enter your height in inches: ");
		
		//store user input
		double height = keyboard.nextDouble();
		
		//BMI calculations
		double h_sqrt = height * height;
		double bmi = (weight / h_sqrt) * 703; 
		
		//print results
		System.out.println("\nYour BMI is " + bmi + ".");
	}
}