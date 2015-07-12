
public class CheckFermat {

	
	static double a;
	static double b;
	static double c;
	static double n;
	
	public static void fermat(double a, double b, double n)
	{
		double resultA = Math.pow(a, n);
		double resultB = Math.pow(b, n);
		double resultC = resultA + resultB;
		if (n == 2)
		{
			System.out.println("Holy holy smokes Fermat was wrong");
		}
		else
		{
		System.out.println(resultC);
		}
	}
	
	public static void main(String[] args) 
	{
		
		fermat(3,4,3);
		fermat(3,4,2);
	}

}
