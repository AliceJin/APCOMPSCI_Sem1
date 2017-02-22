public class GameRunner
{
	public static void main(String[]args)
	{
		XBox t1 = new XBox();
		XBox t2 = new XBox("sdkd");
		PlayStation t3 = new PlayStation();
		PlayStation t4 = new PlayStation("sdkd");
		PC t5 = new PC();
		PC t6 = new PC("sdkd");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
	}
}