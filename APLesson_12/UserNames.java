public class UserNames
{
	//instance var
	private String userName, firstName, lastName;
	
	//default constructor
	public UserNames()
	{
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//constructor with params
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier - can change from outside
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public static void main(String[]args)
	{
		UserNames object = new UserNames("proHandsome", "Professor", "Handsome");
		
		System.out.println("<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		
		UserNames object1 = new UserNames();
		
		System.out.println("<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>");
		System.out.println("Name: " + object1.getFirstName() + " " + object1.getLastName());
		System.out.println("User Name: " + object1.getUserName());
	}
}
