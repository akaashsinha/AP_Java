
public class RationalTester {

	public static void main(String[] args) 
	{
		Rational testRational = new Rational(1,3);
		Rational testRational2 = new Rational(2,6);
		testRational.printRational();
		testRational.negate();
		testRational.printRational();
		testRational.toDouble();
		testRational.add(testRational2);
		testRational.reduce(testRational2); 
	}

}
