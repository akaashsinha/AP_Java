
public class gradeCalculator 
{

	public static void getGrade()
	{
	
	double totalPoints = 1450;
	double currentPoints = 898;
	
		while((currentPoints/totalPoints) * 10 != 80)
		{
		currentPoints++;
		
		}
	System.out.println(currentPoints/100);
	}
	
	
	public static void main(String[] args)
	{
		getGrade();
	}
}
