
public class eToTheX {

	
	public static double myExp(double x, int n)
	{
		double product = 1;
		double xth = 1;
		int i = 1;
		while(i<= n)
		{
			xth = xth*x/i;
			product = product + xth;
			i++;
		}
		return product;
	}
	
	public static void check(double x)
	{
		System.out.println(x + "\t" + Math.exp(x) + myExp(x,17));
	}
	
	public static void main(String[] args) 
	{
		double x = 0.1;
		while (x <= 100.0)
		{
			check(x);
			x*=10;
		}
		x=-0.1;
		while (x >= -100.0)
		{
			check(x);
			x*=10;
		}
	
	}

}
