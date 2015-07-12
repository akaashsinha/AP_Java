
public class sortThree {

	
	public static void sortThreeMethod(int a, int b, int c)
	{
		if((a >= b) || (a >= c))
				{
				System.out.print(a);
				if(b >= c)
					{
						System.out.print(c + " " + b);
					}
				}
		
	}
	
	public static void main(String[] args) 
	{
		
		sortThreeMethod(5,8,2);
		
	}

}
