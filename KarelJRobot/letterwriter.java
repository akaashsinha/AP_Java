
public class letterwriter extends SuperRobot
{

	public letterwriter(int street, int avenue, Direction direction, int howmany) {
		super(street, avenue, direction, howmany);
		// TODO Auto-generated constructor stub
	}
	
	public void printH()
	{
//	move();
	putBeeper();
	move_and_put();
	move_and_put();
	move_and_put();
	move_and_put();
	turnLeft();
	turnLeft();
	move();
	move();
	turnLeft();
	move_and_put();
	move_and_put();
	move_and_put();
	turnRight();
	move_and_put();
	move_and_put();
	turnLeft();
	turnLeft();
	move();
	move();
	move_and_put();
	move_and_put();
	}
	public void printE()
	{
		putBeeper();
		move4_put_4();
		turnRight();
		move2_put_2();
		turnRight();
		move_two();
		turnRight();
		putBeeper();
		move_and_put();
		turnAround();
		move();
		turnRight();
		move_two();
		turnRight();
		putBeeper();
		move_and_put();
	}
	public void printL()
	{
		turnAround();
		move_two();
		putBeeper();
		turnLeft();
		move4_put_4();
		turnAround();
		move_four();
		turnLeft();
		move2_put_2();
	}
	public void printO()
	{
		move4_put_4();
		move_and_put();
		turnLeft();
		move4_put_4();
		turnLeft();
		move4_put_4();
		turnLeft();
		move3_put3();
		move();
		pickBeeper();
		turnLeft();
		removeCorner();
		removeCorner();
		removeCorner();
		turnRight();
		move();
	}
	public void removeCorner()
	{
		move_four();
		pickBeeper();
		turnLeft();
	}
}
