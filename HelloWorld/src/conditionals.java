
public class conditionals {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		printparity(42);
		countdown(10000);
		
	}
	public static void printparity(int x) {
		if (x%2 == 0)
		{	
			
			System.out.println("x is even");
			
		}
		else
		{
			System.out.println("x is odd");
		}

	
		
	}
	public static void countdown(int n)
	{
		if (n == 0){
			
			System.out.println("Blastoff");
		}
		else
		{
			System.out.println(n);
			countdown(n-1);
		}
	}
}
