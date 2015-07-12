import kareltherobot.*;


public class Fence implements Directions {

	
	public static void task()
	{
		HarvesterBot karel = new HarvesterBot(1, 1, North, 0);
		karel.move_three();
		karel.pickBeepers();
		karel.faceEast();
		karel.move_three();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.fillBot();
		karel.move();
		karel.putBeeper();
		karel.fillLeft();
		karel.move();
		karel.putBeeper();
		karel.fillTop();
		karel.move();
		karel.putBeeper();
		karel.fillRight();
		karel.move();
		
	}
	
	
	public static void main(String[] args) 
	{

		World.setDelay(3);
		World.readWorld("Fence.txt");
		World.setVisible();
		task();

	}

}
