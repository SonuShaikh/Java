// Demonstrate use of the Choise
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ChoiceDemo extends Applet implements ItemListener{
	String smg = " ";
	Choice os, browser;
	
	public void init(){
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
		os = new Choice();
		browser = new Choice();
		
		// Add item to os liste
		os.add("Windows XP");
		os.add("Windows 7");
		os.add("Windows 8");
		os.add("Windows 8.1");
		os.add("Windows 10");
		
		// Add item to Browser liste
		browser.add("Internet Explorer");
		browser.add("FireFox");
		browser.add("Chrome");
		browser.add("NetScape");
		
		// add Choise to Window
		add(os);
		add(browser);
		
		//register choise to recieve item event
		os.addItemListener(this);
		browser.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	// Display Current selection 
	public void paint(Graphics g){
		smg = "The Current os selection : ";
		smg += os.getSelectedItem();
		g.drawString(smg,6,120);
		
		smg = "The Current Browser Selection : ";
		smg += browser.getSelectedItem();
		g.drawString(smg,6,140);
	}
}