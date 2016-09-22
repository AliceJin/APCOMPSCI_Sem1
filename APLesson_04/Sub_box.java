import java.util.Scanner;

public class Sub_box
{
	public static void main(String[]args)
	{
		//instantiates scanner
		Scanner kb = new Scanner(System.in);
		//create new object
		Sub_box calc = new Sub_box();
		
		System.out.println("Hello! This program will calculate the volume of subwoofer boxes.");
		System.out.println("Please enter the height in inches:");
		double h = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter the length in inches:");
		double l = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter the width in inches:");
		double w = kb.nextDouble();
		kb.nextLine();
		
		//call on method
		double volume = calc.calcVol(h, l, w);
		
		//print results
		System.out.printf("The volume of the subwoofer boxes in cubic feet is %5.2f", volume);
	}
	
	public double calcVol(double h, double l, double w)
	{
		double inch_v = h * l * w;         //calculate volume in inches
		return inch_v / 1728;              //return volume in cubic feet
	}	
}