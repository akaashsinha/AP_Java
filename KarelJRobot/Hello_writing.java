import kareltherobot.*;
public class Hello_writing implements Directions {

	public static void task()
	{
		letterwriter karel = new letterwriter(1, 1, North, infinity);
		
		karel.printH();
		karel.turnAround();
		karel.move_three();
		karel.move();
		karel.turnLeft();
		karel.move_two();
		karel.turnLeft();
		karel.printE();
		karel.turnAround();
		karel.move_three();
		karel.putBeeper();
		karel.turnLeft();
		karel.move4_put_4();
		karel.turnAround();
		karel.move_four();
		karel.turnLeft();
		karel.move2_put_2();
		karel.turnLeft();
		karel.turnLeft();
		karel.printL();
		karel.printO();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		World.setDelay(2);
		World.readWorld("blank.TXT");
		World.setVisible();
		task();
		
	}

}
