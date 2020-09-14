//init
import java.awt.*;
import javax.swing.*;

public class initApplet extends JApplet
{
	String fName;
	String sName;
	public void init()
	{
		String fName= JOptionPane.showInputDialog("Enter the First Name :");
		String sName = JOptionPane.showInputDialog("Enter The Second Name : ");
		
		
		
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("First Name is The "+fName,20,30);
		g.drawString("Second Name is The "+sName,35,45);
	}
}