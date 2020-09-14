// Demonstrate use of the Checkbox
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckboxDemo extends Applet implements ItemListener{
	String smg = "";
	Checkbox winXP, win7, win10,mac;
	
	public void init(){
		winXP = new Checkbox("Windows XP",null,true);
		win7 = new Checkbox("Windows 7 ");
		win10 = new Checkbox("Windows 10");
		mac = new Checkbox("Mac Os");
		
		add(winXP);
		add(win7);
		add(win10);
		add(mac);
		
		
		winXP.addItemListener(this);
		win7.addItemListener(this);
		win10.addItemListener(this);
		mac.addItemListener(this);
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	
	
	// display curren item state of the item
	public void paint(Graphics g){
		smg = "Current State : ";
		g.drawString(smg,6,80);
		
		smg = "Windows XP : "+winXP.getState();
		g.drawString(smg,6,100);
		
		smg = "windows 7 : "+win7.getState();
		g.drawString(smg,6,120);
		
		smg = "Windows 10 : "+win10.getState();
		g.drawString(smg,6,140);
		
		smg = "Mac Os : "+mac.getState();
		g.drawString(smg,6,160);
	}
}