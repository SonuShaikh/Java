import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonDemo2 extends Applet implements ActionListener{
	String smg = "";
	Button sonu, anita , goodbay;
	public void init(){
		 sonu = new Button("Sonu");
		 anita = new Button("Anita");
		 goodbay = new Button("GoodBay");
		
		add(sonu);
		add(anita);
		add(goodbay);
		sonu.addActionListener(this);
		anita.addActionListener(this);
		goodbay.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		if(s== "Sonu"){
			smg = "Hello Sonu...!!";
		}else if (s == "Anita"){
			smg = "Hello Anita...!";
		}else
			smg = "Good Bay....!";
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(smg,6,100);
	}
}