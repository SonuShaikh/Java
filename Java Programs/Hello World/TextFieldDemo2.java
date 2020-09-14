// Demonstrate use of the of textfield 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class TextFieldDemo2 extends Applet implements ActionListener{
	TextField Name,Pass;
	String smg;
	public void init(){
		Label name = new Label("Name : ",Label.RIGHT);
		Label pass = new Label("Password : ",Label.RIGHT);
		
		Name = new TextField("",12);
		Pass = new TextField("",12);
		Pass.setEchoChar('*');
		
		add(name);
		add(Name);
		add(pass);
		add(Pass);
		
		// Register it to 
		Name.addActionListener(this);
		Pass.addActionListener(this);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public void actionPerformed(ActionEvent ae){
		repaint();
	}
	public void paint(Graphics g){
		
		String N = Name.getText();
		String P = Pass.getText();
		if(N == "" && P ==""){
			if(N == "Sonu" && P == "Anita"){
				smg = "You are Enter Successfuly";
			}
		}
		else{
			smg = "You are not Register to This site";
		}
		g.drawString(smg,5,100);
		/* g.drawString("Name : "+Name.getText(),6,100);
		g.drawString("Password : "+Pass.getText(),6,120);
		g.drawString("Select Text : "+Name.getSelectedText(),6,140); */
		
	}
}