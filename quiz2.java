import java.util.Scanner;
public class quiz2
{
	static int num1 = 5;
	static int num2 = 7;
	static int num3 = 9;
	
	public static void main(String[]args)
	{
		numPrint(num1, num2, num3);
	}
	
	public static int calcAvg(int one, int two, int three)
	{
		return (one + two + three)/3;
	}
	
	//code fail because method not static
	public void numPrint(int one, int two, int three)
	{
		double avg = calcAvg(one, two, three);
		System.out.println("The average of " + one + ", " + two + ", " + three + " is " + avg);
	}
}