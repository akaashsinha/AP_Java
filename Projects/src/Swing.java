import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Swing extends JFrame
{

	public static void main(String[] args) 
	{

		new Swing();

	}
	
	public Swing() 
	{
		this.setSize(400,400);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPos = (dim.width/2) - (this.getWidth() / 2);
		int yPos = (dim.height/2) - (this.getHeight() / 2);
		this.setLocation(xPos, yPos);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My first Frame");
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("She was a Daytripper! It took me so long to find out and I found out");
		thePanel.add(label1);
		this.add(thePanel);
		this.setVisible(true);
	}
	
}
