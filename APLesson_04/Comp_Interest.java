import java.util.Scanner;                    //import scanner

public class Comp_Interest
{
	public static void main(String[]args)
	{
		//instantiates scanner
		Scanner kb = new Scanner(System.in);  
		//create new object
		Comp_Interest total = new Comp_Interest();
		
		
		//user input
		System.out.println("Hello! Welcome to the Compound Interest Calculator!");
		System.out.println("Please enter the original amount borrowed:");
		double p = kb.nextDouble();           //principal amount
		kb.nextLine();
		
		System.out.println("Please enter the interest rate:");
		double interest = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter the number of times the loan is compounded per year:");
		double number = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter the life of the loan in years:");
		double years = kb.nextDouble();
		kb.nextLine();
		
		//call on method
		double monthly_pay = total.Total_Pay(p, interest, number, years);
		System.out.printf("Your total monthly payment is $%10.2f", monthly_pay);
	}
	
	public double Total_Pay(double p, double interest, double number, double years)
	{
		double exponent = number * years;                  //n * t
		double base = 1 + (interest / number);             //1 + (r/n)
		double result = Math.pow(base, exponent);          //take the power
		double t_pay = p * result;                         //find total
		
		return t_pay / (years * 12);                       //return monthly payment
    }
}