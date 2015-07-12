import java.util.*;
public class obp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h ;
		int bb ;
		int hbp ;
		int ab ;
		int sf ;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Insert how many hits he had: ");
		h = reader.nextInt();
		System.out.println("Insert how many walks he had: ");
		bb = reader.nextInt();
		System.out.println("Insert how many times he was hit by a pitch: ");
		hbp = reader.nextInt();
		System.out.println("Insert how many at bats he had: ");
		ab = reader.nextInt();
		System.out.println("Insert how many sac flies he had: ");
		sf = reader.nextInt();
		int ob1 = h + bb + hbp;
		int ob2 = ab + bb + hbp + sf;
		float obp = (float)ob1 / (float)ob2;
		System.out.println(obp);
		reader.close();
	}
}