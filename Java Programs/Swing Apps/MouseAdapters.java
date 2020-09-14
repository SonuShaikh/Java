// Demonstrate use of the MouseAdapterClass
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GuiAdapter extends JFrame{
	private JLabel statusbarr;
	private String details;
	
	public GuiAdapter(){
		super("The Title");
		
		statusbarr = new JLabel("This is going to Default");
		add(statusbarr, BorderLayout.SOUTH);
		
		addMouseListener(new Myclass());
	}
	private class Myclass extends MouseAdapter{
		public void mouseClicked(MouseEvent me){
			details = String.format("You click %d times",me.getClickCount());
			
			if(me.isMetaDown())
				details += "With Right Mouse Button";
			else if (me.isAltDown())
				details += "With Cente Mouse Button";
			else 
				details += "With Left Mouse Button";
			
			statusbarr.setText(details);
		}
	}
}
class MouseAdapters{
	public static void main(String args[]){
		GuiAdapter s = new GuiAdapter();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(300,200);
		s.setVisible(true);
	}
}