// DEmonstrate use of the Flow Layout
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class FlowlayoutDemo extends Applet implements ItemListener{
	String smg = "";
	Checkbox ipad,imac,iphone, itune;
	public void init(){
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		ipad = new Checkbox("Ipad",null,true);
		imac = new Checkbox("IMac",null,true);
		iphone = new Checkbox("IPhone",null,true);
		itune = new Checkbox("ITune",null,true);
		
		add(ipad);
		add(imac);
		add(iphone);
		add(itune);
		
		ipad.addItemListener(this);
		imac.addItemListener(this);
		iphone.addItemListener(this);
		itune.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		smg = "CurrentState :";
		g.drawString(smg,6,100);
		
		smg = "Ipad : "+ipad.getState();
		g.drawString(smg,6,120);
		
		smg = "IMac : "+imac.getState();
		g.drawString(smg,6,140);
		
		smg = "Iphone : "+iphone.getState();
		g.drawString(smg,6,160);
		
		smg = "Itune : "+itune.getState();
		g.drawString(smg,6,180);
	}
}