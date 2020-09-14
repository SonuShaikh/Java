// Adddinton tow nuk
import java.awt.*;
import javax.swing.*;
public class AddApplet2 extends JApplet
{
	double sub;
	
	public void init()
	{
		String fn = JOptionPane.showInputDialog("Enter the Fist nUmberf");
		String sn = JOptionPane.showInputDialog("Enter the Second NUmber");
		
		double num1= Double.parseDouble(fn);
		double num2= Double.parseDouble(sn);
		
		sub = num1- num2;
	}	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("The subtraction is : "+sub, 25, 30);
	}
}