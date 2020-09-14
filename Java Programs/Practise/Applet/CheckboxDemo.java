import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckboxDemo extends Applet implements ItemListener{
	String smg = "";
	Checkbox winXp,Vist,Mac,Solaris;
	
	public void init(){
		winXp = new Checkbox("Windows Xp",null,true);
		Vist = new Checkbox("Windows Vista",null,true);
		Mac = new Checkbox("Mac Os",null,true);
		Solaris = new Checkbox("Solaris ",null,true);
		
		add(winXp);
		add(Vist);
		add(Mac);
		add(Solaris);
		
		winXp.addItemListener(this);
		Vist.addItemListener(this);
		Mac.addItemListener(this);
		Solaris.addItemListener(this);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		smg = "Show Current Status";
		g.drawString(smg,6,100);
		
		g.drawString("winXp :"+winXp.getState(),6,120);
		g.drawString("Vista :"+Vist.getState(),6,140);
		g.drawString("Mac : "+Mac.getState(),6,160);
		g.drawString("Solaris : "+Solaris.getState(),6,180);
		
	}
}