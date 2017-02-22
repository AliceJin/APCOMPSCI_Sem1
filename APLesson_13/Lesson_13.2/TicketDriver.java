public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup t1 = new Walkup();
		Advance t2 = new Advance(9);
		//Advance t3 = new Advance(10);
		StudentAdvance t4 = new StudentAdvance(9);
		//StudentAdvance t5 = new StudentAdvance(10);
		
		System.out.println(t1);
		System.out.println(t2);
		//System.out.println(t3);
		System.out.println(t4);
		//System.out.println(t5);
	}
}