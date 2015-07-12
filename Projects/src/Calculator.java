
public class Calculator 
{

	String name;
	double number;
	double number2;
	
	
	void add()
	{
		double output = number + number2;
		System.out.println(output);
	}
	
	void multiply()
	{
		double output = number * number2;
		System.out.println(output);
	}
	void division()
	{
		double output = number/number2;
		System.out.println(output);
	}
	void squareRoot()
	{
		double output = Math.sqrt(number);
		System.out.println(output);
	}
	void square()
	{
		double output = number * number;
		System.out.println(output);
	}
	
}
