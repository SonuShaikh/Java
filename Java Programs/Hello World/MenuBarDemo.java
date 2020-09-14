// Demonstrate user of the MemuBar
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class MenuFrame extends Frame{
	String smg = "";
	CheckboxMenuItem debug,test;
	
	public MenuFrame(String title){
			super(title);
	//create a menu bar and add it the Frame
	MenuBar mbar = new MenuBar();
	setMenuBar(mbar);
	// create a menu items.
	Menu file = new Menu("File");
	MenuItem item1,item2,item3,item4,item5;
	file.add(item1 = new MenuItem("New..."));
	file.add(item2 = new MenuItem("Open"));
	file.add(item3 = new MenuItem("Close"));
	file.add(item4 = new MenuItem("-"));
	file.add(item5 = new MenuItem("Quite.."));
	mbar.add(file);
	 
	 Menu edit = new Menu("Edit");
	 MenuItem item6, item7,item8,item9,item10;
	 edit.add(item6 = new MenuItem("Cut"));
	 edit.add(item7 = new MenuItem("Copy"));
	 edit.add(item8 = new MenuItem("Paste"));
	 edit.add(item9 = new MenuItem("-"));
	 
	 Menu sub = new Menu("Special");
	 MenuItem item11,item12;
	 sub.add(item10 = new MenuItem("One"));
	 sub.add(item11 = new MenuItem("Two"));
	 sub.add(item12 = new MenuItem("Three"));
	 edit.add(sub);
	 
	 // These are the CheckboxMenuItem
	 debug = new CheckboxMenuItem("Debug");
	 edit.add(debug);
	 test = new CheckboxMenuItem("Test");
	 edit.add(test);
	 
	 mbar.add(edit);
	 
	 // Create and object to handle Action and Item Events
	 MyMenuHandler handler = new MyMenuHandler(this);
	 //register it to receive those events
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
	 
	 // create an object to handle window Events
	 MyMenuWindowAdapter adapter = new MyMenuWindowAdapter(this);
	 // Register it to receive events
	 addWindowListener(adapter);
	}
	
	public void paint(Graphics g){
		g.drawString(smg,10,150);
		if(debug.getState())
			g.drawString("Debug is On  ",10,170);
		else
			g.drawString("Debug is Off ",10,170);
		if(test.getState())
			g.drawString("Test is On",10,190);
		else
			g.drawString("Test is Off",10,190);
	}
}
class MyMenuWindowAdapter extends WindowAdapter{
	MenuFrame MF;
	public MyMenuWindowAdapter(MenuFrame mf){
		MF = mf;
	}
	public void windowClosing(WindowEvent we){
		MF.setVisible(false);
	}
}
class MyMenuHandler implements ActionListener,ItemListener{
	MenuFrame MF;
	public MyMenuHandler(MenuFrame mf){
		MF = mf;
	}
    // Handle ActionEvent
	public void actionPerformed(ActionEvent ae){
		String smg = "You Selected : ";
		String arg = ae.getActionCommand();
		
		if(arg.equals("New..."))
			smg += "New";
		else if(arg.equals("Open"))
			smg += "Opne";
		else if(arg.equals("Close"))
			smg += "Close";
		else if(arg.equals("Quite.."))
			smg += "Quite";
		else if(arg.equals("Edit"))
			smg += "Edit";
		else if(arg.equals("Cut"))
			smg +="Cut";
		else if(arg.equals("Copy"))
			smg +="Copy";
		else if(arg.equals("Paste"))
			smg +="Paste";
		else if(arg.equals("First"))
			smg +="First";
		else if(arg.equals("Second"))
			smg +="Second";
		else if(arg.equals("Three"))
			smg +="Third";
		else if(arg.equals("Debug"))
			smg +="Debug";
		else if(arg.equals("Test"))
			smg +="Test";
		MF.smg = smg;
		MF.repaint();
	}
	
	//Handle item Events
	public void itemStateChanged(ItemEvent ie){
		MF.repaint();
	}
}
// Create a Frame Windows
public class MenuBarDemo extends Applet{
	Frame f;
	public void init(){
		f = new Frame("MenuFrameDemo");
		int width = Integer.parseInt(getParameter("width"));
		int height = Integer.parseInt(getParameter("height"));
		setSize(new Dimension(width,height));
		
		f.setSize(width,height);
		f.setVisible(true);
		
		setBackground(Color.cyan);
	    setForeground(Color.blue);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
}