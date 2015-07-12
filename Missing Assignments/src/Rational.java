
public class Rational 
{
	int numerator;
	int denominator;

	public Rational()
	{
		numerator = 0;
		denominator = 1;
	}
	
	public Rational(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public void printRational()
	{
		System.out.println(this.numerator + "/" + this.denominator);
	}
	public void negate()
	{
		int originalNumerator = this.numerator;
		int originalDenominator = this.denominator;
		this.numerator = originalDenominator;
		this.denominator = originalNumerator;
	}
	public void toDouble()
	{
		double rationalDouble = (double)this.numerator/(double)this.denominator;
		System.out.println(rationalDouble);
	}
	
	public void add(Rational rational2)
	{
		double rational1 = (double)this.numerator/(double)this.denominator;
		double rational_2 = (double)rational2.numerator/(double)rational2.denominator;
		double combinedRational = rational1+rational_2;
		System.out.println(combinedRational);
	}
	public static int gcd(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		int remainder = a%b;
		return gcd(b,remainder);
	}
	public static void reduce(Rational rational)
	{
		
		int divisor = gcd(rational.numerator, rational.denominator);
		rational.numerator = rational.numerator / divisor;
		rational.denominator = rational.denominator / divisor;
		System.out.println(rational.numerator + "/" + rational.denominator );
		
		
	}
}
