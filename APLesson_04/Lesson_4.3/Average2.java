import java.util.Scanner;     //import scanner
public class Average2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//variables
		double num1;
		double num2;
		double num3;
		double avg;
		
		//takes user input
		System.out.println("Hello! This program calculates the average of 3 numbers.");
		System.out.println("Please enter the first number:");
		num1 = kb.nextDouble();
		System.out.println("Please enter the second number:");
		num2 = kb.nextDouble();
		System.out.println("Please enter the third number:");
		num3 = kb.nextDouble();
		
		//call on methods
		avg = average(num1, num2, num3);
		print(num1, num2, num3, avg);
	}
	
	public static double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3) / 3;
	}
	
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of %5.2f, %5.2f, and %5.2f is %10.5f.",
		num1, num2, num3, avg);
	}
}