// Demonstrate use of the Listi
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ListDemo extends Applet implements ItemListener{
	String smg = "";
	List Name , SirName;
	
	public void init(){
		Name = new List();
		SirName = new List();
		
		Name.add("Sonu");
		Name.add("Sony");
		
		SirName.add("Shaikh");
		SirName.add("Dapke");
		
		add(Name);
		add(SirName);
		
		Name.addItemListener(this);
		SirName.addItemListener(this);
		
		setBackground(Color.cyan);
		setForeground(Color.yellow);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		int idx[];
		
		smg = "Current name";
		idx = Name.getSelectedIndex();
		for(int i = 0; i<idx.length;i++){
			smg +=Name.getSelectedIndex(idx[i])+ " ";
		}
		g.drawString(smg,6,120);
		
		smg = "Current Sirname :";
		smg += SirName.getSelectedItem();
		g.drawString(smg,6,100);
	}
}