import kareltherobot.*;
public class fig3_9 implements Directions {

	public static void task()
	{
		
		SuperRobot karel = new SuperRobot(2,2,East,infinity);
//		karel.putBeeper();
//		karel.move3_put3();
//		karel.move3_put3();
//		karel.move_and_put();
//		karel.turnLeft();
//		karel.move3_put3();
//		karel.move3_put3();
//		karel.move_and_put();
		karel.carpetside();
		karel.carpetside();
		karel.carpetside();
		karel.carpetside();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		World.setDelay(10);
		World.readWorld("fig3-9.txt");
		World.setVisible();
		task();
		
		
	}

	
	
}
