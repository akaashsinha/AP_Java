
public class Sequence 
{
	
	public static void factorial(int n)
	{
		if (n > 0)
		{
			 factorial(n * n-1);
			 System.out.println(n);
		}
	}
	
	public static void main(String[] args) 
	{
		factorial(2);
		
	}

}
