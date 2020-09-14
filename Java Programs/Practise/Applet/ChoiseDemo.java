// Choise
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ChoiseDemo extends Applet implements ItemListener{
	Choice Name,SirName;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.blue);
		Name = new Choice();
		SirName = new Choice();
		
		Name.add("Sonu");
		Name.add("Anita");
		Name.add("Bablu");
		Name.add("Neha");
		Name.add("Soop");
		Name.add("Salman");
		Name.add("Jawed");
		Name.select("Sonu");
		
		SirName.add("Shaikh");
		SirName.add("Dapke");
		SirName.add("Balid");
		SirName.add("Salve");
		SirName.add("Gaikwad");
		SirName.add("Khan");
		SirName.add("Pathan");
		
		SirName.se("Shaikh");
		
		add(Name);
		add(SirName);
		Name.addItemListener(this);
		SirName.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Name",20,100);
		String Nsmg = Name.getSelectedItem();
		g.drawString(Nsmg,20,120);
		String Ssmg = SirName.getSelectedItem();
		g.drawString("SirName",120,100);
		g.drawString(Ssmg,120,120);
	}
}