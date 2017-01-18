public class Human
{
	private String hair, eyes, skin;
	
	//default constructor
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	//constructor with params
	public Human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//modifier
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Accessors
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}