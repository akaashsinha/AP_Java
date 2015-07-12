import java.util.*;
public class RockPaperScissors {

//	 static int randomNumber = (int) ((int) 3*  Math.random() + 1);
	
	
	public static void main(String[] args) 
	{
		//System.out.println(randomNumber);
		int rock = 1;
		int paper = 2;
		int scissors = 3;
		int wins = 0 ;
		int losses = 0;
		int ties  = 0;
		int n = 1;
		int x = 2;
		Scanner reader = new Scanner(System.in);
		while (n == 1)
		{	
		int randomNumber = (int) ((int) 3*  Math.random() + 1);
		System.out.println("Let's play rock paper scissors");
		System.out.println("Enter one for rock");
		System.out.println("Enter two for paper");
		System.out.println("Enter three for scissors");
		System.out.println("Enter your choice: ");
		int choice = reader.nextInt();
		if (choice == rock)
		{
			if (randomNumber == 1)
			{
				System.out.println("You both chose rock");
				ties++;
			}
			if (randomNumber == 2)
			{
				System.out.println("You lose the computer chose paper");
				losses++;
			}
			if (randomNumber == 3)
			{
				System.out.println("You win! The computer chose scissors");
				wins++;
			}
		}
		if (choice == paper)
		{
			if (randomNumber == 1)
			{
				System.out.println("You win! The computer chose rock");
				wins++;
			}
			if (randomNumber == 2)
			{
				System.out.println("You both chose paper");
				ties++;
			}
			if (randomNumber == 3)
			{
				System.out.println("You lose the computer chose scissors");
				losses++;
			}
		}
		if (choice == scissors)
		{
			if (randomNumber == 1)
			{
				System.out.println("You lose the computer chose rock");
				losses++;
			}
			if (randomNumber == 2)
			{
				System.out.println("You win! The computer chose paper");
				wins++;
			}
			if (randomNumber == 3)
			{
				System.out.println("You both chose scissors");
				ties++;
			}
		}
		System.out.println("If you want to play again press one or two if you want see your score ");
		x =	reader.nextInt();
			if(x == 2)
			{
				System.out.println("Wins: " + wins);
				System.out.println("Ties: " + ties);
				System.out.println("Losses: " + losses);
				System.out.println("If you want to play again press one:");
				n = reader.nextInt();
			}
	//		reader.close();
	}
	reader.close();
	}
	
}