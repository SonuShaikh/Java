// Demonstrate use of Checkbox Group
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CBGroup2 extends Applet implements ItemListener{
	String smg = "";
	Checkbox sonu, monu , sony;
	CheckboxGroup cbg;
	
	public void init(){
		cbg = new CheckboxGroup();
		sonu = new Checkbox("Sonu",cbg,false);
		monu = new Checkbox("Monu",cbg,false);
		sony = new Checkbox("Sony",cbg,false);
		
		add(sonu);
		add(monu);
		add(sony);
		
		
		sonu.addItemListener(this);
		monu.addItemListener(this);
		sony.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		smg = "Current Selection : ";
		smg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(smg,6,100);
	}
}