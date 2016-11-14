public class AvgNumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];  //new array
		
		//set array value as random int
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		//print array
		System.out.println("Numbers...");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		
		//print average
		System.out.println("\nThe average of the above numbers is..." + average(numbers));
	}
	
	public static int average(int[] n)
	{
		int avg = 0;
		for(int num : n)
		{
			avg += num;
		}
		return avg /= n.length;
	}
}