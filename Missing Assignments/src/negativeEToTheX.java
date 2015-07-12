
public class negativeEToTheX {

	
	public static double gauss(double x, int n)
	{
		double product = 1.0;
		double term = 1.0;
		int i = 1;
		while (i <= n)
		{
			term = -1*term*x*x/i;
			product += term;
			i++;
		}
		return product;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(gauss(2,5));

	}

}
