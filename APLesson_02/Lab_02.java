public class Lab_02
{
	public static void main(String[]args)
	{
		//multiplication variables
		int int1 = 2;
		int int2 = 4;
		int int_ans = int1 * int2;
		
		//surface area variables
		int l = 2;
		int w = 2; 
		int h = 13;
		int sa = 2 * (l * w + l * h + w * h);
		
		/* multiplication */
		System.out.println(int1 + " multiplied by " + int2 + " is " + int_ans);
		
		int1 = 5;             //change int value
		int2 = 6;
		int_ans = int1 * int2;
		System.out.println(int1 + " multiplied by " + int2 + " is " + int_ans);
		
		/* address */
		System.out.println("\nAlice Jin");
		System.out.println("3710 Del Mar Heights Rd");
		System.out.println("San Diego, 92130\n");
		
		/* SA of a rectangular cube*/
		System.out.println("The surface area of your rectangle is " + sa);
	}
}