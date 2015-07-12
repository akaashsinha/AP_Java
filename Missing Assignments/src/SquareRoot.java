
public class SquareRoot 
{

	public static double squareRoot(double a)
	{
		double x = 0;
		double x1 = a/2;
		while (Math.abs(x1-x) > 0.0001)
		{
			x = x1;
			x1 = (x + a/x)/2;
		}
		return x1;
	}
	
	public static void main(String[] args)
	{
		System.out.println(squareRoot(9));
	}
}
