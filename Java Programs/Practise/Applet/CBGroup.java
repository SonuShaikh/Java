//Applying Checkboxes
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CBGroup extends Applet implements ItemListener{
	String smg;
	Checkbox Sonu,Sony,Dapke,Shaikh;
	CheckboxGroup Name,SirName;
	Label Names , SirNames;
	
	public void init(){
		Name = new CheckboxGroup();
		SirName = new CheckboxGroup();
		Sonu  = new Checkbox("Shahabaj",Name,true);
		Sony  = new Checkbox("Anita",Name,false);
		Dapke  = new Checkbox("Dapke",SirName,false);
		Shaikh  = new Checkbox("Shaikh",SirName,true);
		Names = new Label("Names");
		SirNames = new Label("SirNames");
		
		add(Names);
		add(Sonu);
		add(Sony);
		add(SirNames);
		add(Dapke);
		add(Shaikh);
		
		Sonu.addItemListener(this);
		Sony.addItemListener(this);
		Dapke.addItemListener(this);
		Shaikh.addItemListener(this);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		/* String smg ="";
		smg += Name.getSelectedCheckbox().getLabel();
		g.drawString(smg,6,100);
		smg += SirName.getSelectedCheckbox().getLabel();
		g.drawString(smg,6,120); */
		
		
		 if(Sonu.getState()== true && Shaikh.getState() == true){
			smg = "Shaikh Shahabaj \n" +
			"Phone : 96238586\n"+
			"Job : Student";
			g.drawString(smg,6,120);
		}else if(Sony.getState() == true && Dapke.getState() == true){
			smg = "Dapke Anita\n"+
			"Phone : 96238586\n"+
			"Job : Student";
			g.drawString(smg,6,120);
		}else{
			smg = "No data Found";
			g.drawString(smg,6,120);
		} 
	}
}