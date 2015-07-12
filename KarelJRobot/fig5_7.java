import kareltherobot.*;

public class fig5_7 implements Directions{

	public static void task()
	{
		SuperRobot karel = new SuperRobot(1,1, East, 0);
		karel.move();
		karel.keepMoving();
		karel.turnLeft();
		karel.move();
		karel.checkAndPick();
		karel.turnLeft();
		karel.turnAround();
		karel.move_two();
		karel.turnRight();
		karel.move();
		karel.keepMoving();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move_and_pick();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		World.setDelay(20);
		World.readWorld("fig5-7.txt");
		World.setVisible();
		task();
		
	}

}
