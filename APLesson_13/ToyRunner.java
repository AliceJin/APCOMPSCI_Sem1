public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure f1 = new AFigure("Bob");
		Car c1 = new Car("Mary");
		ToyStore t1 = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car");
		System.out.println(f1);
		System.out.println(c1);
		System.out.println(t1);
	}
}