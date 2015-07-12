import java.util.*;
public class IncomeTaxCalculator {

	static Scanner grossIncomeReader = new Scanner(System.in);
	static double grossIncome = 50000.5 ;
	static int dependents = 4;
	static double taxableIncome = grossIncome - 10000 - 2000 * dependents;
	static double incomeTax = taxableIncome * 0.20;
	
	public static void main(String[] args) 
	{
		System.out.println("Enter your gross income: ");
	//	grossIncome = grossIncomeReader.nextDouble();
		System.out.println("Enter how many dependents you have: ");
	//	grossIncome = grossIncomeReader.nextInt();
		System.out.println(incomeTax);
		

	}

}
