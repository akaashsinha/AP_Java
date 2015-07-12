
public class Abcedarian 
{

	public static boolean isAbecedarian(String s)
	{
		int index = 0;
		char c = 'a';
		while (index < s.length())
		{
			if(c > s.charAt(index))
			{
				return false;
			}
			c = s.charAt(index);
			index++;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(isAbecedarian("Akaash"));

	}

}
