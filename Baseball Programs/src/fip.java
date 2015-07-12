import java.util.*;
public class fip {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int hr ;
		int bb ;
		int k ;
		int hbp;
		double ip;
		System.out.println("Enter how many homeruns he gave up: ");
		hr = reader.nextInt();
		System.out.println("Enter how many walks he gave: ");
		bb = reader.nextInt();
		System.out.println("Enter how many batters he hit: ");
		hbp = reader.nextInt();
		System.out.println("Enter how many strikeouts he had: ");
		k = reader.nextInt();
		System.out.println("Enter how many innings he pitched: ");
		ip = reader.nextDouble();
		
		int fi = (13 * hr) + (3 * (bb+hbp)) - (2 * k);
		double fi2 = fi / (double)ip;
		double fip = fi2 + 3.048;
		System.out.println(fip);
		reader.close();
	}

}
