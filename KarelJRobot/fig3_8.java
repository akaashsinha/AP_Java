import kareltherobot.*;
public class fig3_8 implements Directions {

	public static void task()
	{
		
		SuperRobot karel = new SuperRobot(1, 2, East, 4) ;
		karel.move_three();
		karel.turnLeft();
		karel.move_three();
		karel.move_and_put();
		karel.turnLeft();
		karel.move_three();
		karel.turnRight();
		karel.move();
		karel.turnRight();
		karel.move_two();
		karel.move_and_put();
		karel.turnLeft();
		karel.move_three();
		karel.turnRight();
		karel.move();
		karel.turnRight();
		karel.move_two();
		karel.move_and_put();
		karel.turnLeft();
		karel.move_three();
		karel.turnRight();
		karel.move();
		karel.turnRight();
		karel.move_two();
		karel.move_and_put();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		World.setDelay(20);
		World.readWorld("fig3-8.txt");
		World.setVisible();
		task();
		
	}

}
