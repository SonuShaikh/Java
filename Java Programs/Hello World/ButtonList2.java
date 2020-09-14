import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonList2 extends Applet implements ActionListener{
	String smg = "";
	Button bList[]= new Button[3];
	
	public void init(){
		Button sonu = new Button("Sonu");
		Button anita = new Button("Anita");
		Button shaikh = new Button("Shaikh");
		
		// add button 
		bList[0]= (Button) add(sonu);
		bList[1]= (Button) add(anita);
		bList[2]= (Button) add(shaikh);
		
		// Register 
		for(int i = 0; i< 3; i++){
			bList[i].addActionListener(this);
			
			setBackground(Color.cyan);
			setForeground(Color.blue);
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		for(int i = 0; i<3; i++){
			if(ae.getSource() == bList[i]){
				smg = "Hello "+bList[i].getLabel()+". How Are You..??";
			}
		}
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(smg,6,100);
	}
}