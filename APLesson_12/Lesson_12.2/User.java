public class User
{
	private String firstName, lastName, avatar;
	private int userID;
	
	//default constructor
	public User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	//constructors with params
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int) (Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int) (Math.random() * 1000000) + 1;
	}
	
	//modifier
	public void setAvatar(String av)
	{
		avatar = av;
	}
}