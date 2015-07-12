import java.util.Scanner;
public class Pythagorean 
{

	
	public static void main(String[] args) 
	{
	
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter A: ");
		double a = reader.nextDouble();
		System.out.println("Enter B: ");
		double b = reader.nextDouble();
		double pythag = Math.sqrt((a*a) + (b * b));
		System.out.println("Your C is: " + pythag);

		reader.close();
	}

}
