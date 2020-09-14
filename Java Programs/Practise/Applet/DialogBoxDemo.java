// Demonstrate user of the Dialog Box
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// Create a subclass of Dialog
class SampleDialog extends Dialog implements ActionListener{
	SampleDialog(Frame parent,String title){
		super(parent,title,false);
		setLayout(new FlowLayout());
		setSize(300,200);
		
		add(new Label("PressThisButton"));
		Button b;
		add(b = new Button("Cancel"));
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		dispose();
	}
	public void paint(Graphics g){
		g.drawString("This is the DialogBox Window",30,20);
	}
}

// Create sub Frame Window
class SampleFrame1 extends Frame{	
	String smg = "";
	CheckboxMenuItem debug;
	public SampleFrame1(String title){
		super(title);
		
		// Create a MenuBar and add it
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		
		// Crete a menu and add item to it
		Menu file = new Menu("File");
		MenuItem item1,item2,item3;
		file.add(item1 = new MenuItem("New"));
		file.add(item2 = new MenuItem("Open"));
		file.add(item3 = new MenuItem("Close"));
		mbar.add(file);
		
		Menu edit = new Menu("Edit");
		MenuItem  item4,item5,item6;
		edit.add(item4 = new MenuItem("Copy"));
		edit.add(item5 = new MenuItem ("Cut"));
		edit.add(item6 = new MenuItem("Past"));
		
		Menu sub = new Menu("Special");
		MenuItem item7,item8;
		sub.add(item7 = new MenuItem("Close"));
		sub.add(item8 = new MenuItem ("Quite"));
		
		debug = new CheckboxMenuItem("Debug");
		edit.add(debug);
		mbar.add(edit);
		
		// Create an Object to Hadle action and item events
		MyMenuHandle1 handler = new MyMenuHandle1(this);
		
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
		item5.addActionListener(handler);
		item6.addActionListener(handler);
		item7.addActionListener(handler);
		item8.addActionListener(handler);
		debug.addActionListener(handler);
		
		// Create an Object to handle Window Events
		MyWindowAdapter1 adapter = new MyWindowAdapter1(this);
		
		// Register it to receive events
		addWindowListener(adapter);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	public void paint(Graphics g){
		g.drawString(smg,10,200);
		if(debug.getState())
			g.drawString("Debug is ON",10,220);
		else
			g.drawString("Debug is OFF",10,220);
		
	}
}
class MyWindowAdapter1 extends WindowAdapter{
	SampleFrame1 SF;
	public MyWindowAdapter1 (SampleFrame1 sf){
		SF = sf;
	}
	public void windowClosing(WindowEvent we){
		SF.setVisible(false);
	}
}
class MyMenuHandle1 implements ActionListener,ItemListener{
	SampleFrame1 SF;
	public MyMenuHandle1(SampleFrame1 sf){
		SF = sf;
	}
	
	public void actionPerformed(ActionEvent ae){
		String smg = "YOu Have Salected :";
		String arg = ae.getActionCommand();
		// Active Dialog box Whene New is Selected
		
		if(arg.equals("New")){
			smg  = "New";
			//SampleDialog d = new SampleDialog(SampleFrame1, "NewDialogBox");
			SampleDialog d = new SampleDialog(SampleFrame1, "New Dialog Box");
			d.setVisible(true);
		}
		SF.smg = smg;
		SF.repaint();
	}
	public void itemStateChanged(ItemEvent ie){
		SF.repaint();
	}
	
}

// Create MainWindow
public class DialogBoxDemo extends Applet{
	Frame f;
	public void init(){
		f =new SampleFrame1("This is SampleFrame");
		int width = Integer.parseInt(getParameter("width"));
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