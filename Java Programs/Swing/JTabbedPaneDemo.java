// Demonstrate user of the JTabbedPane
import javax.swing.*;
public class JTabbedPaneDemo extends JApplet{
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				SonuGUI();
			}
		});
		}catch(Exception e){
			System.out.println("Applet Vant Create Becaouse "+e);
		}
	}
	public void SonuGUI(){
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Citites",new CitiPanel());
		jtp.addTab("Color",new ColorPanel());
		jtp.addTab("Flavors",new FlavorsPanel());
		add(jtp);
	}
}

class CitiPanel extends JPanel{
	public CitiPanel(){
		JButton b1 = new JButton("NewYork");
		add(b1);
		
		JButton b2 = new JButton("London");
		add(b2);
		
		JButton b3 = new JButton("Mumbai");
		add(b3);
		
		JButton b4 = new JButton("HongKong");
		add(b4);
	}	
}

class ColorPanel extends JPanel{
	public ColorPanel(){
		JCheckBox cb1 = new JCheckBox("Red");
		add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Green");
		add(cb2);
		
		JCheckBox cb3 = new JCheckBox("Blue");
		add(cb3);
	}
}

class FlavorsPanel extends JPanel{
	public FlavorsPanel(){
		JComboBox jcb = new JComboBox();
		
		jcb.addItem("Vanila");
		jcb.addItem("Chocolate");
		jcb.addItem("Strawberry");
		
		add(jcb);
	}
}