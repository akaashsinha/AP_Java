package numbers;

import java.util.Scanner;

public class TimeZoneConverter {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		int option ;
		int exit = 1 ;
		while (exit == 1)
		{
		System.out.println("Press 1 to convert Eastern Time to Central Time, 2 to convert to Mountain Time, and 3 to convert to Pacific Time");
		option = reader.nextInt();
		if (option == 1)
		{
			System.out.println();
		}
		if (option == 2)
		{
			
		}
		if (option == 3)
		{
			
		}
		if (option == 4)
		{
			exit = 2;
			System.out.println("Have a nice day! ");
		}
	}
		reader.close();
  }
	

}
