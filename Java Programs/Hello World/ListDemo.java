// Demonstrate use of the LIst
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ListDemo extends Applet implements ActionListener{
	String msg = "";
	List os,browser;
	
	public void init(){
		os      = new List(3,true);
		browser = new List(3,true);
		
		// add selection to the os
		os.add("windows 8");
		os.add("windows 8.1");
		os.add("windows 10");
		
		// add Selectioin to the Browser
		browser.add("FireFox");
		browser.add("Chore");
		browser.add("Edge");
		
		browser.select(1);
		// add list to  window
		add(os);
		add(browser);
		
		// register the to receive the ActionEvent
		os.addActionListener(this);
		browser.addActionListener(this);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public void actionPerformed(ActionEvent ae){
		repaint();
	}
	
	public void paint(Graphics g){ 
		int idx[];
		msg = "Current OS: "; 
		idx = os.getSelectedIndexes(); 
		for(int i=0; i<idx.length; i++) 
			msg += os.getItem(idx[i]) + "  "; 
		g.drawString(msg, 6, 120); 
		msg = "Current Browser: "; 
		msg += browser.getSelectedItem(); 
		g.drawString(msg, 6, 140);

	}
} 



