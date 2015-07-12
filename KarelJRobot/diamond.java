import kareltherobot.*;


public class diamond implements Directions {

	
	public static void task()
	{
		HarvesterBot karel = new HarvesterBot(1, 6, North, 40);
		karel.move();
		karel.diamondLeft();
		karel.faceEast();
		karel.move();
		karel.move();
		karel.diamondDown();
		karel.move();
		karel.faceNorth();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.diamondUp();
		karel.move_two();
		karel.diamondDown();
		karel.turnOff();
	
	}
	
	
	public static void main(String[] args) 
	{

		World.setDelay(5);
		World.readWorld("diamond613.txt");
		World.setVisible();
		task();

	}

}
