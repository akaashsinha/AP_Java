
public class iterativePower {

	
	public static double power(double x, int n)
	{
		int i = 0;
		double toPower = 1.0;
		while (i < Math.abs(n))
		{
			if (n > 0)
			{
				toPower = toPower * x;
			}
			else
			{
				toPower = toPower /x;
			}
			i++;
		}
		return toPower;
	}
	
	public static void main(String[] args) 
	{
	
		System.out.println(power(3,-3));

	}

}
