
public class power {

	public static int powermethod(double x, int n)
	{
		if(n == 1)
		{
			return (int) x;
		}
		return (int) (x * powermethod(x, n-1));
		if ( n > 1)
		{
			return 
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println((powermethod(1,1)));
		
	}

}
