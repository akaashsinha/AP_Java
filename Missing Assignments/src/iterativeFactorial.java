
public class iterativeFactorial {

	public static int factorial (int x)
	{
		int results = 1;
		while (x > 0)
		{
			results = results*x;
					x--;
		}
		return results;
	}
	
	public static void main(String[] args) 
	{
		int x = factorial(5);
		System.out.println(x);
	}

}
