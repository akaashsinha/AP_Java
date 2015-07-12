
public class CyberMan extends SuperRobot 
{

	public CyberMan(int street, int avenue, Direction direction, int howmany) 
	{
		super(street, avenue, direction, howmany);
	}

	public void garden()
	{
		if (inCorner())
		{
			putBeeper();	
		}
		while(inCorner() == true)
		{
			move();
			if(topIsClear())
			{
				faceNorth();
				move();
				faceWest();
				break;
				
			}
			
			
		}
		while(frontIsClear())
		{
			move();
		}
		if(inCorner())
		{
			putBeeper();
		}
		move();
	}

	private boolean leftIsClear() 
	{
		faceWest();
		if (frontIsClear())
		{
			return true;
		}
		return false;
	}
	private boolean topIsClear() 
	{
		faceNorth();
		if(frontIsClear())
		{
			return true;
		}
		return false;
	}
	
	private boolean inCorner()
	{
		if(!frontIsClear() && !leftIsClear())
		{
			return false;
		}
		faceEast();
		return true;
	}
	public void checkIfRoom()
	{
		faceNorth();
		isInRoom();
	}
	
	public boolean isInRoom()
	{
	
		if(frontIsClear() == false)
		{
			if(leftIsClear() == false)
			{
				if(rightIsClear() == false)
				{
					putBeeper();
					faceSouth();
					move();
					return true;
				}
			}
		}
		
		return false;
	}

	private boolean rightIsClear() 
	{
		faceEast();
		if (frontIsClear())
		{
			return true;
		}
		return false;
	}
	
}
