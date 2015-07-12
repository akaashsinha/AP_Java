import kareltherobot.Robot;

class SuperRobot extends Robot 
{
	// constructor
	public SuperRobot(int street, int avenue, Direction direction,
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
		
	}
	
	public void long_harvest()
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
		move();
		pickBeeper();
	}
	
	public void move_and_pick()
	{
	
		move();
		pickBeeper();
		
	}
	
	public void move_and_put()
	{
		move();
		putBeeper();
	
	}
	
	public void move_two()
	{
	
		move();
		move();
		
	}
	public void move2_put_2()
	{
		move();
		putBeeper();
		move();
		putBeeper();
	}
	public void move_three()
	{
	
		move();
		move();
		move();
		
	}	
	public void move_four()
	{
		move();
		move();
		move();
		move();
	}
	
	public void move3_put3()
	{
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		
	}	
	public void move4_put_4()
	{
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
	}
	
	public void carpetside()
	{
	
		//putBeeper();
		move3_put3();
		move3_put3();
		move_and_put();
		turnLeft();
		
		
	}
	public void turnAround()
	{ 
		turnLeft();
		turnLeft();
	}
	public void faceNorth()
	{
		if (facingEast())
			{
			turnLeft();
			}
		if (facingSouth())
			{	
			turnLeft();
			turnLeft();
			}
		if (facingWest())
			{
			turnRight();
			}
	}
	public void faceEast()
	{
		if (facingSouth())
			{
			turnLeft();
			}
		if (facingNorth())
			{
			turnRight();
			}
		if(facingWest())
			{
			turnAround();
			}
	}
	public void faceSouth()
	{
	if (facingEast())
		{
		turnRight();
		}
	if (facingNorth())
		{
		turnAround();
		}
	if(facingWest())
		{
		turnLeft();
		}
	}
	public void faceWest()
	{
		if (facingEast())
		{
		turnAround();
		}
	if (facingNorth())
		{
		turnLeft();
		}
	if(facingSouth())
		{
		turnRight();
		}
	}
	public void keepMoving()
	{
		while(nextToABeeper())
		{
			pickBeeper();
			move();
			pickBeeper();
		}
	}
	public void checkAndPick()
	{
		keepMoving();
//		keep
	}
	public void decide()
	{
		int i = 0;
		while (nextToABeeper())
		{
			pickBeeper();
			i++;
		}
		if(i%2 == 0)
		{
			faceEast();
			move();
			while(nextToABeeper())
			{
				pickBeeper();
			}
		}
		else
		{
			faceWest();
			move();
			while(nextToABeeper())
			{
				pickBeeper();
			}
		}
		
	}
	public void squareGarden()
	{
		while(frontIsClear())
		{
			putBeeper();
			move();
			if(frontIsClear() == false)
			{
				turnRight();
			}
		}
		
	}
	
}

	
 // class
