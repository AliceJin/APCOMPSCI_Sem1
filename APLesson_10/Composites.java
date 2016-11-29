//error array index out of bounds

import java.util.ArrayList;
import java.util.Arrays;
public class Composites
{
	//Array with numbers
	static Integer[] numbers = {2, 6, 8, 9, 10, 12, 13, 15 , 
	17, 24, 55, 66, 78, 77, 79};
	//store numbers values in an arraylist
	static ArrayList <Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
	
	public static void main(String[] args)
	{
		System.out.println(nums); //
		removeComposites();
		System.out.println(nums);
	}
	
	public static int gFactor(int n)
	{
		int flag = 0;
		for(int i = 2; i < n; i++)
		{
			if((n % i) == 0)
			{
				flag = 1;
			}
		}
		return flag;
	}
	
	public static void removeComposites()
	{
		for(int i = 0; i < nums.size(); i++)
		{
			System.out.println(nums.get(i)); //
			if(gFactor(nums.get(i)) == 0)
			{
				System.out.println(nums.get(i)); //
				nums.remove(nums.indexOf(i)); //error
				System.out.println(nums); //
			}
		}
	}
}