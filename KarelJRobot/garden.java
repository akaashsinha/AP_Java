import kareltherobot.Directions;
import kareltherobot.World;


public class garden implements Directions
{
	
	public static void task()
	{
		CyberMan karel = new CyberMan(5,5, East, 30);
		karel.garden();
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		World.setDelay(10);
		World.readWorld("garden68.txt");
		World.setVisible();
		task();
		
	}
}
