import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpressSolve
{
	public static void main(String[]args)
	{
		//user input
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = kb.nextLine();
		
		//String to Arraylist
		ArrayList <String> equation = new ArrayList <> (Arrays.asList(expression.split(" "))); 
		
		//print
		System.out.println(doEquation(equation));
	}
	
	public static ArrayList doEquation(ArrayList <String> eq)
	{
		int i = 0;
		while(i < eq.size())
		{
			if(eq.get(i).equals("*") || eq.get(i).equals("/"))
			{
				if(eq.get(i).equals("*"))
				{
					eq.set(i, "" + (Integer.parseInt(eq.get(i - 1)) * Integer.parseInt(eq.get(i + 1))));
				}
				else
				{
					eq.set(i, "" + (Integer.parseInt(eq.get(i - 1)) / Integer.parseInt(eq.get(i + 1))));
				}
				eq.remove(i - 1);
				eq.remove(i);
				i--;
			}
			i++;
		}
		i = 0;
		while(i < eq.size())
		{
			if(eq.get(i).equals("+") || eq.get(i).equals("-"))
			{
				if(eq.get(i).equals("+"))
				{
					eq.set(i, "" + (Integer.parseInt(eq.get(i - 1)) + Integer.parseInt(eq.get(i + 1))));
				}
				else 
				{
					eq.set(i, "" + (Integer.parseInt(eq.get(i - 1)) - Integer.parseInt(eq.get(i + 1))));
				}
				eq.remove(i - 1);
				eq.remove(i);
				i--;
			}
			i++;
		}
		return eq;
	}
}