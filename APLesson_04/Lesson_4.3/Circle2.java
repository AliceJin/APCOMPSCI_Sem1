import java.util.Scanner;       //import scanner

public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//variables
		double r;            //radius of circle
		double area;         //area
	
		//user input
		System.out.println("Hello! This programs calculates the area of a circle");
		System.out.println("Please enter the radius:");
		r = kb.nextDouble();
		
		//call on methods
		area = calcArea(r);
		print(r, area);
	}
	
	public static double calcArea(double r)
	{
		return 3.1415 * (r * r);
	}
	
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of %5.2f is %10.5f.", r, area);
	}
}