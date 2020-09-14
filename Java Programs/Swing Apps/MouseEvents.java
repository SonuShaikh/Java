// Demonstrate use of the MouseEvents
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GuiMouse extends JFrame{
	private JPanel mousePanel;
	private JLabel statusbar;
	
	public GuiMouse(){
		super("The Title");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.CYAN);
		add(mousePanel,BorderLayout.CENTER);
		
		statusbar = new JLabel("Default");
		add(statusbar,BorderLayout.SOUTH);
		
		MyHandlerC hand = new MyHandlerC();
		
		mousePanel.addMouseListener(hand);
		mousePanel.addMouseMotionListener(hand);
		
	}
	
	private class MyHandlerC implements MouseMotionListener,MouseListener{
		public void mouseClicked(MouseEvent me){
			statusbar.setText(String.format("Mouse Clicked At %d,%d",me.getX(),me.getY()));
		}
		public void mousePressed(MouseEvent me){
			statusbar.setText("Mouse Pressed Down At"+me.getX()+ ","+me.getY());
		}
		public void mouseReleased(MouseEvent me){
			statusbar.setText("MouseButton Released");
		}
		public void mouseEntered(MouseEvent me){
			statusbar.setText("Mouse Cursor Enter Into Panel");
			mousePanel.setBackground(Color.PINK);
		}
		public void mouseExited(MouseEvent me){
			statusbar.setText("Mouse Cursor Goes Out of the Panel");
			mousePanel.setBackground(Color.WHITE);
		}
		
		// Mouse Motion Events
		
		public void mouseDragged(MouseEvent me){
			statusbar.setText(String.format("Mouse Draggin at %d,%d",me.getX(),me.getY()));
		}
		public void mouseMoved(MouseEvent me){
			statusbar.setText(String.format("Mouse Moving at %d %d",me.getX(),me.getY()));
		}
	}
}

class MouseEvents{
	public static void main(String args[]){
		GuiMouse sonu = new GuiMouse();
		sonu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sonu.setSize(300,200);
		sonu.setVisible(true);
	}
}