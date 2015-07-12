public class Checker {

	
	public static boolean StringChecker(String s, String let)
	{
		System.out.print("Looking for: " + let);
		if(s.indexOf(let) > -1)
		{
			System.out.print(" " + true);
			return true;
		}
		System.out.print(" " + false);
		return false;
	}
	
	public static void main(String[] args) 
	{
		StringChecker("akaash sinha matt tennant","az");

	}

}
