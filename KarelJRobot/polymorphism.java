import kareltherobot.*;
public class polymorphism implements Directions {

	public static void task()
	{
		SuperRobot karel = new SuperRobot(2,2, East, 0);
		karel.long_harvest();
		karel.move_and_pick();
		karel.turnLeft();
		karel.move_and_pick();
		karel.turnLeft();
		karel.long_harvest();
		karel.turnOff();
		
		karel = new SuperRobot(4,2,East, 0);
		karel.long_harvest();
		karel.move_and_pick();
		karel.turnLeft();
		karel.move_and_pick();
		karel.turnLeft();
		karel.long_harvest();
		karel.turnOff();
		
		karel = new SuperRobot(6, 2, East, 0);
		karel.long_harvest();
		karel.move_and_pick();
		karel.turnLeft();
		karel.move_and_pick();
		karel.turnLeft();
		karel.long_harvest();
		karel.turnOff();
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		World.setDelay(10);
		World.readWorld("fig3-3a.txt");
		World.setVisible();
		task();
	}

}
