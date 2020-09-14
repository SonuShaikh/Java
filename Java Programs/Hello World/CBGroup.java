// Demonstrate use of the checkbox group
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CBGroup extends Applet implements ItemListener{
	String smg = "";
	Checkbox winxp, win7,win8,win8_1,win10;
	
	CheckboxGroup cbg ;
	public void init(){
		cbg   = new CheckboxGroup();
		winxp = new Checkbox("Windows XP",cbg,false);
		win7  = new Checkbox("Windows 7",cbg,false);
		win8  = new Checkbox("Windows 8",cbg,false);
		win8_1= new Checkbox("Windows 8_1",cbg,false);
		win10 = new Checkbox("Windows 10",cbg,false);
		
		add(winxp);
		add(win7);
		add(win8);
		add(win8_1);
		add(win10);
		winxp.addItemListener(this);
		win7.addItemListener(this);
		win8.addItemListener(this);
		win8_1.addItemListener(this);
		win10.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	// declare 
	public void paint(Graphics g){
		smg = "Current selectioin : ";
		smg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(smg,6,100);
	}
}