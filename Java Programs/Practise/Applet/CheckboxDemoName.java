// Checkbox
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckboxDemoName extends Applet implements ItemListener {
	String smg = "";
	Checkbox Sonu,Sony;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
		Sonu = new Checkbox("Shahabaj");
		Sony = new Checkbox("Anita");
		
		add(Sonu);
		add(Sony);
		
		Sonu.addItemListener(this);
		Sony.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		if(Sonu.getState()){
			smg = "This is the Sonus Block";
			g.drawString(smg,6,100);
		}
		if(Sony.getState()){
			smg = "This is the Sonys Block";
			g.drawString(smg,6,110);
		}
	}
}