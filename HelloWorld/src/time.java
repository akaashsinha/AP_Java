public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This program calculates seconds since midnight and seconds left till midnight and
		// the percentage of the day you've experienced. Use 24 hour clock

		
		int hour = 13 ;
		int minute = 0;
		int second = 0 ;
		int secondspassed = (hour * 60 * 60) + (minute * 60) + second;
		int secondsleft = 86400 - secondspassed ;
		double percentage = (secondspassed / 864000.00) ;
		double num = (percentage * 10);
		int percision = 10000;
		double result = Math.floor(num * percision +.5) / 100; 
	
		
		System.out.println(hour + ":" + minute + ":" + second);
		System.out.println("It's been " + secondspassed + " seconds since midnight");
		System.out.println("There are " + secondsleft + " seconds left till midnight");
		System.out.println("You've experienced " + result + " percent" + " of your day") ;
	}

}