import kareltherobot.*;


public class Field612 implements Directions {

	
	public static void task()
	{
		HarvesterBot karel = new HarvesterBot(5, 2, East, 40);
		karel.move();
		karel.harvestBeepers();
		karel.move();
		karel.harvestBeepers();
		karel.faceEast();
		karel.move();
		karel.harvestBeepers();
		karel.move();
		karel.harvestBeepers();
		karel.faceEast();
		karel.move();
		karel.harvestBeepers();
		karel.turnOff();
	}
	
	
	public static void main(String[] args) 
	{

		World.setDelay(5);
		World.readWorld("field612.txt");
		World.setVisible();
		task();

	}

}
