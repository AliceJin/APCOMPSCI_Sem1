import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//user inputs
		System.out.println("Hi! Welcome to the GPA calculator");
		System.out.println("Please enter your math grade: ");
		String math = kb.nextLine();
		System.out.println("Please enter your science grade: ");
		String science = kb.nextLine();
		System.out.println("Please enter your english grade: ");
		String english = kb.nextLine();
		System.out.println("Please enter your history grade: ");
		String history = kb.nextLine();
		System.out.println("Please enter your computer science grade: ");
		String compsci = kb.nextLine();
		System.out.println("Please enter your physical education grade: ");
		String pe = kb.nextLine();
		System.out.println("Please enter your foreign language grade: ");
		String language = kb.nextLine();
		
		//calculate gpa
		double gPoints = calcPoints(math) + calcPoints(science) + calcPoints(english)
		+ calcPoints(history) + calcPoints(compsci) + calcPoints(pe) + calcPoints(language);
		double gpa = gPoints / 7; 
		System.out.printf("Your GPA is %1.1f\n", gpa);
	}
	
	public static double calcPoints(String grade)
	{
		double gradePoints = 0;
		if (grade.equals("A"))
			gradePoints = 4.0;
		else if (grade.equals("B"))
			gradePoints = 3.0;
		else if (grade.equals("C"))
			gradePoints = 2.0;
		else if (grade.equals("D"))
			gradePoints = 1.0;
		else if (grade.equals("F"))
			gradePoints = 0.0;
		else
			System.out.println("User input not valid. Please try again");
		
		return gradePoints;
	}
}