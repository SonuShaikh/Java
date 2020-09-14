// Additon of two number by using the Applets
import java.awt.*;
import javax.swing.*;
public class AddApplet extends JApplet
{
	double sum;
	public void init()
	{
		String fn = JOptionPane.showInputDialog("Enter The First Number");
		String sn = JOptionPane.showInputDialog("Enter The Second Number");
		
		double num1 = Double.parseDouble(fn);
		double num2 = Double.parseDouble(sn);
		
		 sum = num1+num2;
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		/* g.drawString("The Sumation is : "+sum, 20.25); */
		g.drawString("The Sumationd is : "+sum, 20, 25);
	}
}