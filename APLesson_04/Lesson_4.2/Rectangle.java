import java.util.Scanner;         //import scanner
public class Rectangle
{
	static double l;              //length
	static double w;              //width
	static double p;              //perimeter
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//set user input as l and w
		System.out.println("Please enter the length:");
		l = kb.nextDouble();
		System.out.println("Please enter the width:");
		w = kb.nextDouble();
		
		//call on methods
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		p = 2 * (l + w);
	}
	
	public static void print()
	{
		System.out.printf("The given length is %5.2f ft and width is %5.2f ft.\n", l, w);
		System.out.printf("Your rectangle is %10.5f sq ft around.", p);
	}
}