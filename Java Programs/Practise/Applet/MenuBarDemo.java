// Demonstrate MenuBar
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// Create a Sub class of Frame
class MenuFrame extends Frame{
	String smg = "";
	CheckboxMenuItem debug,test;
	
	public MenuFrame(String title){
		super(title);
		// Create a Menu Bar and add it to Frame
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		
		// Create MenuItem
		
		Menu file = new Menu("File");
		MenuItem item1,item2,item3,item4,item5;
		file.add(item1 = new MenuItem("New.."));
		file.add(item2 = new MenuItem("Open.."));
		file.add(item3 = new MenuItem("Close"));
		file.add(item4 = new MenuItem("-"));
		file.add(item5 = new MenuItem("Quite"));
		
		mbar.add(file);
		
		Menu edit = new Menu("Edit");
		MenuItem item6,item7,item8,item9;
		edit.add(item6 = new MenuItem("Copy"));
		edit.add(item7 = new MenuItem("Cut"));
		edit.add(item8 = new MenuItem("Paste"));
		edit.add(item9 = new MenuItem("_"));
		
		Menu sub = new Menu("Special");
		MenuItem item10, item11,item12;
		sub.add(item10 = new Menu("Frist"));
		sub.add(item11 = new Menu("Second"));
		sub.add(item12 = new Menu("Thrid"));
		edit.add(sub);
		
		// These are the Checkable Items
		debug = new CheckboxMenuItem("Debug");
		edit.add(debug);
		test = new CheckboxMenuItem("Test");
		edit.add(test);
		
		mbar.add(edit);
		
		// Create an Object to Handle action and item listener
		MyMenuHandler handler = new MyMenuHandler(this);
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
		item5.addActionListener(handler);
		item6.addActionListener(handler);
		item7.addActionListener(handler);
		item8.addActionListener(handler);
		item9.addActionListener(handler);
		item10.addActionListener(handler);
		item11.addActionListener(handler);
		item12.addActionListener(handler);
		debug.addActionListener(handler);
		test.addActionListener(handler);
		
		// Create an Object to Handle a WindowEvent
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		
		// Register it to receive the events
		addWindowListener(adapter);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	
	public void paint(Graphics g){
		g.drawString(smg,10,200);
		if(debug.getState())
			g.drawString("Debuge is On",10,220);
		else
			g.drawString("Debuge is Off",10,220);
		if(test.getState())
			g.drawString("Test is On",10,240);
		else
			g.drawString("Test is Off",10,240);
	}
}
class MyWindowAdapter extends WindowAdapter{
	MenuFrame MF;
	public MyWindowAdapter(MenuFrame mf){
		MF = mf;
	}
	public void windowClosing(WindowEvent we){
		MF.setVisible(false);
	}
}
class MyMenuHandler implements ActionListener,ItemListener{
	MenuFrame MF ;
	public MyMenuHandler(MenuFrame mf){
		MF = mf;
	}
	public void actionPerformed(ActionEvent ae){
		String smg = " You Selected :";
		String arg = ae.getActionCommand();
		
		if(arg.equals("Open.."))
		   smg += "Opne";
	   else if(arg.equals("New.."))
		   smg += "New";
	   else if(arg.equals("Close"))
		   smg +="Close";
	   else if(arg.equals("Quite"))
		   smg += "Quite";
	    else if(arg.equals("Copy"))
		   smg += "Copy";
	    else if(arg.equals("Cut"))
		   smg += "Cut";
	    else if(arg.equals("Past"))
		   smg += "Past";
	    else if(arg.equals("First"))
		   smg += "First";
	    else if(arg.equals("Second"))
		   smg += "Second";
	    else if(arg.equals("Thrid"))
		   smg += "Thrid";
	    else if(arg.equals("Debug"))
		   smg += "Debug";
	    else if(arg.equals("Test"))
		   smg += "Test";
	   
	   MF.smg = smg;
	   MF.repaint();
	   
	}
	
	// Handle ItemEvent
	public void itemStateChanged(ItemEvent ie){
		MF.repaint();
	}
}
public class MenuBarDemo extends Applet{
	Frame f;
	public void init(){
		f = new MenuFrame("MenuFrame");
		int width =  Integer.parseInt(getParameter("width"));
		int height = Integer.parseInt(getParameter("height"));
		
		setSize(new Dimension(width,height));
		
		f.setSize(width,height);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
}