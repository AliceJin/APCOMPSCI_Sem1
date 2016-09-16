import java.util.Scanner;                          //import scanner

public class ID_Card
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);       //instantiates scanner
		ID_Card form = new ID_Card();              //create new object
		
		//reads user input
		System.out.println("Enter your first name: ");
		String f_name = kb.nextLine();
		
		System.out.println("Enter your last name: ");
		String l_name = kb.nextLine();
		
		System.out.println("Enter your title: ");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site: ");
		String site = kb.nextLine();
		
		System.out.println("Enter the school year: ");
		String year = kb.nextLine();
		
		System.out.println("What is your subject? ");
		String subject = kb.nextLine();
		
		//call on method
		form.format(f_name, l_name, title, site, year, subject);
	}
	
	//method for formatting id card
	public void format
	(String f_name, String l_name, String title, String site, String year, String subject)
	{
		System.out.println("****************************************");
		System.out.printf("* %15s %20s *\n", site, year);
		System.out.printf("* %15s %20s *\n", f_name, l_name);
		System.out.printf("* %15s %20s *\n", title, subject);
		System.out.println("****************************************");
	}
}