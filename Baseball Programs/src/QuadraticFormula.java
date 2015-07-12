
public class QuadraticFormula 
{

	static double a = 1 ;
	static double b = 3 ;
	static double c = 4 ;
	
	public static void main(String[] args) 
	{
		b =	Math.abs(b) * - 1;
		double bSquared = b * b;
		double fourA = 4 * a;
		double fourC = 4 * c;
		double ac = fourA + fourC;
		double divider = 2 * a;
		double squareRootOfB = Math.sqrt(bSquared) ;
		double squareRootOfAC = Math.sqrt(ac);
		System.out.println();
		System.out.println((squareRootOfB - squareRootOfAC) / divider);
	}

}
