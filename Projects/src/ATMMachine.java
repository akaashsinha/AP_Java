import java.util.*;
public class ATMMachine {

	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		double withdraw ;
		double deposit ;
		double balance = 5423;
	//	double checkBalance ;
		int option ;
		int exit = 1 ;
		while (exit == 1)
		{
		System.out.println("Welcome to Goliath National Bank what would you like to do?");
		System.out.println("Press 1 to withdraw, 2 to deposit, 3 to check your balance, and 4 to exit ");
		option = reader.nextInt();
		if (option == 1)
		{
			System.out.println("How much would you like to withdraw? ");
			withdraw = reader.nextDouble();
			balance -= withdraw;
			System.out.println("Your new balance is: " + balance);
			System.out.println("Thank you for doing your banking at GNB");
		}
		if (option == 2)
		{
			System.out.println("How much would you like to deposit? ");
			deposit = reader.nextDouble();
			balance += deposit;
			System.out.println("Your new balance is: " + balance);
			System.out.println("Thank you for doing your banking at GNB");
		}
		if (option == 3)
		{
			System.out.println("Your current balance is: " + balance); // this might be messed up
			System.out.println("Thank you for doing your banking at GNB");
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
