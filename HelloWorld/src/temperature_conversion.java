import java.util.Scanner;
public class temperature_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in) ;
		double f ;
		double c ;
		
		System.out.println("Enter degrees in Fahrenheit: ");
		f = reader.nextDouble();
		c = (f - 32.0) * 5.0 / 9.0 ;
		System.out.println("Equivalent in Celsius is");
		System.out.println(c);
		reader.close();
	}

}
