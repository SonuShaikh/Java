//getSourct()
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonList extends Applet implements ActionListener{
	String smg = "";
	Button[] bList = new Button[3];
	public void init(){
		Button yes = new Button("Yes");
		Button no = new Button("No");
		Button maybe = new Button("Undefined");
		
		// Reference to Button to add
		bList[0] = (Button) add(yes);
		bList[1] = (Button) add(no);
		bList[2] = (Button) add(maybe);
		
		// Resister to LIstenrner ot receive Action
		for(int i=0;i<3;i++){
			bList[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent ae){
		for(int i=0;i<3;i++){
			if(ae.getSource() == bList[i]){
				smg = "You Pressed "+bList[i].getLabel();
			}
		}
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(smg,6,100);
	}
}