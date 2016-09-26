import java.util.Scanner;     //import scanner
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//takes user input
		System.out.println("Hello! This program calculates the average of 3 numbers.");
		System.out.println("Please enter the first number:");
		num1 = kb.nextDouble();
		System.out.println("Please enter the second number:");
		num2 = kb.nextDouble();
		System.out.println("Please enter the third number:");
		num3 = kb.nextDouble();
		
		//call on methods
		average();
		print();
	}
	
	public static void average()
	{
		avg = (num1 + num2 + num3) / 3;
	}
	
	public static void print()
	{
		System.out.printf("The average of %5.2f, %5.2f, and %5.2f is %10.5f.",
		num1, num2, num3, avg);
	}
}