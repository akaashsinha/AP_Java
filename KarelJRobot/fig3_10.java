import kareltherobot.*;
public class fig3_10 implements Directions 
{

	public static void task()
	{
		SuperRobot karel = new SuperRobot(3, 3, East, 12) ;
		karel.move3_put3();
		karel.turnLeft();
		karel.move3_put3();
		karel.turnLeft();
		karel.move3_put3();
		karel.turnLeft();
		karel.move3_put3();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		World.setDelay(20);
		World.readWorld("blank.txt");
		World.setVisible();
		task();
	}

}
