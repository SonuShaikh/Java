// Drawing class
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Peach extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.PINK);
		g.fillRect(25,25,100,30);
		
		g.setColor(Color.CYAN);
		g.fillRect(25,65,100,30);
		
		g.setColor(Color.YELLOW);
		g.drawString("Hello Welcome to Drawing Class",25,120);
	}
}

class Sonu{
	public static void main(String[] arg){
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach p = new Peach();
		f.add(p);
		f.setSize(300,200);
		f.setVisible(true);
	}
}