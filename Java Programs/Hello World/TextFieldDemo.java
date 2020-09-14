// Demonstrate use of the textField
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class TextFieldDemo extends Applet implements ActionListener{
	TextField Name,Password;
	public void init(){
				
		Label name = new Label("Name : ",Label.RIGHT);
		Label pass = new Label("Password : ",Label.RIGHT);
		Name = new TextField("Name Please",15);
		Password = new TextField("Password please",15);
		Password.setEchoChar('*');
		
		add(name);
		add(Name);
		add(pass);
		add(Password);
		
		
		// register it to reviec the 
		Name.addActionListener(this);
		Password.addActionListener(this);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public void actionPerformed(ActionEvent ae){
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Name : "+Name.getText(),6,80);
		g.drawString("Selected Text in Name "+Name.getSelectedText(),6,100);
		g.drawString("Password : "+Password.getText(),6,120);
	}
}