import java.util.Scanner;       //import scanner

public class Circle
{
	static double r;            //radius of circle
	static double area;         //area
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//user input
		System.out.println("Hello! This programs calculates the area of a circle");
		System.out.println("Please enter the radius:");
		r = kb.nextDouble();
		
		//call on methods
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = Math.PI * (r * r);
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %5.2f is %10.5f.", r, area);
	}
}