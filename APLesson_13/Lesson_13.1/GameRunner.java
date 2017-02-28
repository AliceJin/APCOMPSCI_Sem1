public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem t1 = new XBox();
		GameSystem t2 = new XBox("sdkd");
		GameSystem t3 = new PlayStation();
		GameSystem t4 = new PlayStation("sdkd");
		GameSystem t5 = new PC();
		GameSystem t6 = new PC("sdkd");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
	}
}