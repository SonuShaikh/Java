// Ddemonstrate use of the TEXTFIELD
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class TextFieldDemo extends Applet implements ActionListener{
     String smg;
	 TextField NameT,PassT;
	 public void init(){
		 Label NameL = new Label("Name: ",Label.RIGHT);
		 Label PassL = new Label("PassWord :",Label.RIGHT);
		 
		  NameT = new TextField("Name Pls",10);
		  PassT = new TextField(10);
		  PassT.setEchoChar('*');
		 add(NameL);
		 add(NameT);
		 add(PassL);
		 add(PassT);
		 
		 NameT.addActionListener(this);
		 PassT.addActionListener(this);
		 
		 setBackground(Color.cyan);
		 setForeground(Color.blue);
	 }
	 public void actionPerformed(ActionEvent ae){
		 repaint();
	 }
	 public void paint(Graphics g){
		 g.drawString("Name :"+ NameT.getText(),6,100);
		 g.drawString("Selected Text : "+NameT.getSelectedText(),6,120);
		 g.drawString("PassWord : "+PassT.getText(),6,140);
	 }
}