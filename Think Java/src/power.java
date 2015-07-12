
public class power {
	
	
	public static double pow(double x,double n)
	{
		if (n == 0)
		{
			return 1;
		}
		if	(n > 0)
		{
			return x*pow(x, n-1);
		}
		else if (n < 0)
		{
			return 1/x * pow(1/x, n -n -1);
		}
		return 0;
	}

	public static void main(String[] args) 
	{
	
		System.out.println(pow(3,-1));

	}

}
