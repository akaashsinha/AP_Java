import kareltherobot.Robot;

public class HarvesterBot extends SuperRobot
{

	public HarvesterBot(int street, int avenue, Direction direction, int howmany) 
	{
		super(street, avenue, direction, howmany);
		// TODO Auto-generated constructor stub
	}

	
	public void harvestBeepers()
	{
		while(nextToABeeper())
		{
			pickBeeper();
			move();
		}
		if(!nextToABeeper())
		{
			faceNorth();
			move();
			turnLeft();
		}
	}
	
	public void diamondLeft()
	{
		while(nextToABeeper())
		{
			pickBeeper();
			turnLeft();
			move();
			faceNorth();
			move();
			
		}
	}
	public void diamondDown()
	{
		while(nextToABeeper())
		{
			pickBeeper();
			turnRight();
			move();
			faceEast();
			move();
			
		}
	}
	public void diamondUp()
	{
		while(nextToABeeper())
		{
			pickBeeper();
			move();
			faceNorth();
			move();
			faceWest();			
		}
		faceEast();
	}	
	
	public void pickBeepers()
	{
		while(nextToABeeper())
		{
			pickBeeper();
		}
	}
	public void fillBot()
	{
		while(!topIsClear())
		{
			move();
			putBeeper();
		}
	}
	
	public void fillLeft()
	{
		while(!leftIsClear())
		{
			move();
			putBeeper();
		}
	}
	
	public void fillTop()
	{
		while(!botIsClear())
		{
			move();
			putBeeper();
		}
	}
	public void fillRight()
	{
		while(!rightIsClear())
		{
			move();
			putBeeper();
		}
		move();
	}
	
	
	private boolean botIsClear() 
	{
		faceSouth();
		if (frontIsClear())
		{
			return true;
		}
		faceWest();
		return false;
	}
	private boolean leftIsClear() 
	{
		faceWest();
		if (frontIsClear())
		{
			return true;
		}
		faceNorth();
		return false;
	}
	
	private boolean rightIsClear() 
	{
		faceEast();
		if (frontIsClear())
		{
			return true;
		}
		faceSouth();
		return false;
	}
	
	
	
	private boolean topIsClear() 
	{
		faceNorth();
		if(frontIsClear())
		{
			return true;
		}
		faceEast();
		return false;
	}
}

