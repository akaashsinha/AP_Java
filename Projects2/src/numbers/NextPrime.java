package numbers;

public class NextPrime 
{

	public static boolean isPrime(int x)
	{
		// every composite number can be made from 2, 3, or 11 genius moment!
		if ((x == 2) || (x==3) || (x==11))
		{
				return true;
		}
		if ((x%2 == 0) || (x%3 == 0) || (x%7 == 0) || (x%11 == 0))
		{
			return false;
		}
		return true;
	}
		
	public static int getNextPrime(int x)
	{
		// only gets if from even numbers
		while(isPrime(x) == false)
		{
			x++;
		}
		return x;
		
	}

	
	public static void main(String[] args) 
	{
		System.out.println(isPrime(103));
		System.out.println(getNextPrime(135));
	}

}
