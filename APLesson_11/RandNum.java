public class RandNum
{
	public static void main(String[]args)
	{
		int[][] nums = new int[4][4];     //new array
		
		//fill in array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		
		//print array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}