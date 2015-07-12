import kareltherobot.*;


public class Carper69 implements Directions {

	
	public static void task()
	{
		SuperRobot karel = new SuperRobot(6, 2, East, 40);
		karel.squareGarden();
		
	}
	
	
	public static void main(String[] args) 
	{

		World.setDelay(20);
		World.readWorld("carpet69.txt");
		World.setVisible();
		task();

	}

}
