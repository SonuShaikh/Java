// Demonstrate JFrame Applications
import java.awt.*;
import javax.swing.*;
class Frames extends JFrame{
	JLabel item1;
	public Frames(){
		super("JFrame title");
		
		setLayout(new FlowLayout());
		item1 = new JLabel("This goning Show");
		item1.setToolTipText("Hello Sonu");
		
		add(item1);
		
	}
}
class JFrames{
	public static void main(String[] args){
		Frames sonu = new Frames();
		sonu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sonu.setSize(200,250);
		sonu.setVisible(true);
	}
}