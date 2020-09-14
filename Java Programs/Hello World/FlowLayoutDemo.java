// use left aling flow lay out
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class FlowLayoutDemo extends Applet implements ItemListener{
	String msg = "";
	Checkbox Sonu, Monu, Sony, Pony;
	
	public void init(){
		setLayout(new FlowLayout(FlowLayout.TRAILING, 15,5));
		Sonu = new Checkbox("Sonu Shaikh ",null,true);
		Monu = new Checkbox("Monu Shaikh ",null,true);
		Sony = new Checkbox("Sony Dapke ",null,true);
		Pony = new Checkbox("Pony Shaikh ",null,true);
		
		add(Sonu);
		add(Monu);
		add(Sony);
		add(Pony);
		
		Sony.addItemListener(this);
		Sonu.addItemListener(this);
		Monu.addItemListener(this);
		Pony.addItemListener(this);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
	}
	
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	
	public void paint(Graphics g){
		msg = "Current State is ";
		g.drawString(msg,6,100);
		msg = "Sonu shaikh "+Sonu.getState();
	
	
		g.drawString(msg,6,120);
		msg = "Monu shaikh "+Monu.getState();
		
		g.drawString(msg,6,140);
		msg = "Sony Dapke "+Sony.getState();
		
		g.drawString(msg,6,160);
		msg = "Pony shaikh "+Pony.getState();
		g.drawString(msg,6,180);
	}
}