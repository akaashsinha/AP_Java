import kareltherobot.*;

public class fig5_8 implements Directions{

	public static void task()
	{
		//spent 20 minutes on isInRoom only to find out karel didn't have Beeper
		CyberMan karel = new CyberMan(1,1, East, 10);
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.isInRoom();
		karel.turnLeft();
		karel.move();
		karel.isInRoom();
		karel.move();
		karel.isInRoom();
		karel.move();
		karel.isInRoom();
		karel.move();
		karel.isInRoom();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.isInRoom();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		World.setDelay(10);
		World.readWorld("fig5-8.txt");
		World.setVisible();
		task();
		
	}

}
