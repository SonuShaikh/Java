// Demonstrat Button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonDemo extends Applet implements ActionListener{
	String smg = "";
	Button yes,no,maybe;
	public void init(){
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Undefined");
		
		add(yes);
		add(no);
		add(maybe);
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		if(s== "Yes"){
			smg = "You Pressed Yes.";
		}
		else if (s== "No"){
			smg = "You Pressed No.";
		}
		else 
			smg = "You Pressed MayBe";
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(smg,6,100);
	}
}