import java.util.Scanner;         //import scanner
public class Rectangle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//variables
		double l;              //length
		double w;              //width
		double p;              //perimeter
		
		//set user input as l and w
		System.out.println("Please enter the length:");
		l = kb.nextDouble();
		System.out.println("Please enter the width:");
		w = kb.nextDouble();
		
		//call on methods
		p = calcPerim(l, w);
		print(l, w, p);
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2 * (l + w);
	}
	
	public static void print(double l, double w, double p)
	{
		System.out.printf("The given length is %5.2f ft and width is %5.2f ft.\n", l, w);
		System.out.printf("Your rectangle is %10.5f sq ft around.", p);
	}
}