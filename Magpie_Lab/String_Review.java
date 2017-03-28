public class String_Review
{
	public static void main(String[]args)
	{
		//lowercase
		String a = "ASDKFJF";
		System.out.println(a.toLowerCase());
		//index with offset
		String name = "zazzccccccccczazzcccccc";
		System.out.println(name.indexOf("zazz", 5));
		//trim
		String b = "     Yo!    ";
		System.out.println("\"" + b.trim() + "\"");
	}
}