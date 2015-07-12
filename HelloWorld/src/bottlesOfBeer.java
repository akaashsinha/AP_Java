public class bottlesOfBeer {

	public static void beer(int n)
	{
		
		if (n > 1)
		{
			System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer, Take one down, pass it around" );
			beer(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		beer(99);
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
		System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
	}

}
