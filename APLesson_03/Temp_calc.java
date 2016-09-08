import java.util.Scanner; //import scanner

public class Temp_calc
{
	public static void main(String [] args)
	{
		//instantiates the scanner
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Hello! This program will convert Fahrenheit to Celsius.");
		System.out.println("Please enter the temperature you wish to convert: ");
		
		//store user input
		double fahr = keyboard.nextDouble();
		
		//conversion calculations
		double cels = ((fahr - 32) / 1.8); 
		
		//print results
		System.out.println("The corresponding temperature in Celsius is:" + cels);
	}
}