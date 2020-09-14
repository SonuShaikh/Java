// Demonstrate use of the Checkbox
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CheckboxDemo2 extends Applet implements ItemListener{
	String smg = "";
	Checkbox Sonu,Anita,Shaikh,Dapke;
	
	public void init(){
		setBackground(Color.gray);
		setForeground(Color.cyan);
		
		Sonu = new Checkbox("Sonu",null,true);
		Anita = new Checkbox("Anita");
		Shaikh = new Checkbox("Shaikh",null,false);
		Dapke = new Checkbox("Dapke");
		
		add(Sonu);
		add(Anita);
		add(Shaikh);
		add(Dapke);
		
		
		Sonu.addItemListener(this);
		Shaikh.addItemListener(this);
		Anita.addItemListener(this);
		Dapke.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	// Display the Current state of the Checkbox
	public void paint(Graphics g){
		smg = "Current Stete : ";
		g.drawString(smg,6,80);
		
		if(Sonu.getState() == true ){
			smg = "Sonu is Avilable";
		}
		else 
			smg = "Sonu is Not Avalable";
		g.drawString(smg,6,100);
		if(Anita.getState() == true){
			smg = "Anita is Available";
		}else
			smg = "Anita is Not Available";
		
		 g.drawString(smg,6,120);
		 if(Shaikh.getState() == true ){
			smg = "Shaikh is Avilable";
		}
		else 
			smg = "Shaikh is Not Avalable";
		g.drawString(smg,6,140);
		if(Dapke.getState() == true){
			smg = "Dapke is Available";
		}else
			smg = "Dapke is Not Available";
		g.drawString(smg,6,160);
	}
}