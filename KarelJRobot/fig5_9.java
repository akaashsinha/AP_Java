import kareltherobot.Directions;
import kareltherobot.World;


public class fig5_9 implements Directions
{
	
	public static void task()
	{
		CarpetBot karel = new CarpetBot(1,1, East, 10);
		karel.move();
		karel.findRoom();
		karel.findRoom();
		karel.putBeeper();
		karel.faceSouth();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.findRoom();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnAround();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.move_two();
		karel.turnLeft();
		karel.move_two();
		karel.turnAround();
		karel.move_two();
		karel.turnLeft();
		karel.move_four();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		World.setDelay(5);
		World.readWorld("fig5-9.txt");
		World.setVisible();
		task();
		
	}
}
