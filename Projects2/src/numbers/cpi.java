package numbers;
import java.util.Scanner;
public class cpi {

	public static void main(String[] args) 
	{
		double price1;
		double price2;
		Scanner reader = new Scanner(System.in);
		price1 = reader.nextDouble();
		price2 = reader.nextDouble();
		double cpi = (price2/price1) * 100;
		System.out.println(cpi); 
		double inflation = cpi-100;
		System.out.println("The rate of inflation was:"  + inflation);
		reader.close();
	}

}
