import kareltherobot.Robot;

class StairSweeper extends Robot 
{
	// constructor
	public StairSweeper(int street, int avenue, Direction direction,
			int howmany) {
		super(street, avenue, direction, howmany);
	}

	// insert methods here
	public void turnRight() 
	{
		turnLeft();
		turnLeft();
		turnLeft();
		
	} // turnRight
	
	public void climbStair()
	{ 
		turnLeft();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		turnOff();
	}
	
	public void harvest()
	{
		move();
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
	}
	
	public void harvest2()
	{
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
		//move();
		//pickBeeper();
		//move();
		//pickBeeper();
	}
	
} // class
