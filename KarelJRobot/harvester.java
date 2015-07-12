import kareltherobot.Directions;
import kareltherobot.World;


public class harvester implements Directions {

	public static void task()
	{
		
		SuperRobot karel = new SuperRobot(1, 2, East, 0) ;

		karel.turnLeft();
		karel.move();
		karel.turnRight();
		karel.long_harvest();
		karel.move_and_pick();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.turnLeft();
		karel.long_harvest();
		karel.turnRight();
		karel.move_and_pick();
		karel.turnRight();
		karel.long_harvest();
		karel.turnLeft();
		karel.move_and_pick();
		karel.turnLeft();
		karel.long_harvest();
		karel.turnRight();
		karel.move_and_pick();
		karel.turnRight();
		karel.long_harvest();
		karel.turnLeft();
		karel.move_and_pick();
		karel.turnLeft();
		karel.long_harvest();
		karel.turnOff();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		World.setDelay(10);
		World.readWorld("fig3-3a.txt");
		World.setVisible();
		task();
		
	}

}
