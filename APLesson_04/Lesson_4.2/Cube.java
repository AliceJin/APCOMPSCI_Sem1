import java.util.Scanner;       //import scanner

public class Cube
{
	static double side; 
	static double sa;           //surface area
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//user input
		System.out.println("Hello! This programs calculates the surface area of a cube");
		System.out.println("Please enter the side length:");
		side = kb.nextDouble();
		
		//call on methods
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = 6 * (side * side);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with %5.2f side length is %10.5f.", side, sa);
	}
}