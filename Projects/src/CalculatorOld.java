import java.util.Scanner;
public class CalculatorOld 
{

	public static void main(String[] args) 
	{
		int n = 1;
		Scanner reader = new Scanner(System.in);
		int choice ;
		while (n == 1)
		{	
			System.out.println("Press 1 if you'd like to add");
			System.out.println("Press 2 if you'd like to subtract");
			System.out.println("Press 3 if you'd like to divide");
			System.out.println("Press 4 if you'd like to multiply");
			choice = reader.nextInt();
			if (choice == 1)
			{
				System.out.println();
			}
		}

	}

}
