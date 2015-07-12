import kareltherobot.Directions.Direction;


public class CarpetBot extends SuperRobot 
{
	public CarpetBot(int street, int avenue, Direction direction,
			int howmany) 
	{
		super(street, avenue, direction, howmany);
	}
	public void findRoom()
	{
		faceNorth();
		move();
		if(isInRoom() == true)
		{
			putBeeper();
			faceSouth();
			move();
			faceEast();
		}
		if(isInRoom() == false)
		{
			move();
		}
	
	}
	public boolean isInRoom()
	{
		if ((!frontIsClear() && (!rightIsClear()) && (!leftIsClear())))
				{
					return true;
				}
		return false;
	}
	public void escapeRoom()
	{
		faceSouth();
		move();
	}
	public void carpet()
	{
		
		if ((!frontIsClear() && !rightIsClear() && ! leftIsClear()))
		{
			putBeeper();
			
		}
		if((nextToABeeper()) && ( frontIsClear()))
		{
			move();
			putBeeper();
		}
		
	}
	private boolean leftIsClear() {
		faceWest();
		frontIsClear();
		return false;
	}
	private boolean rightIsClear() 
	{
		faceEast();
		frontIsClear();
		return false;
	}
}
