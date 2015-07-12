import kareltherobot.*;
public class danger implements Directions {
	
	
	public static void task()
	{
		
		SuperRobot karel = new SuperRobot(5,5,North, 0);
		karel.decide();
		
		
	}
	public static void main(String[] args) 
	{
		World.setDelay(10);
		World.readWorld("danger.txt");
		World.setVisible();
		task();
	}

}
