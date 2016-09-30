import java.util.Scanner;       //import scanner

public class Cube2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//variables
		double side; 
		double sa;           //surface area
	
		//user input
		System.out.println("Hello! This programs calculates the surface area of a cube");
		System.out.println("Please enter the side length:");
		side = kb.nextDouble();
		
		//call on methods
		sa = calcSurf(side);
		print(side, sa);
	}
	
	public static double calcSurf(double side)
	{
		return 6 * (side * side);
	}
	
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with %5.2f side length is %10.5f.", side, sa);
	}
}