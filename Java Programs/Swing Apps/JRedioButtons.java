// Demonstrate use of the JRadioButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GuiJ extends JFrame{
	JRadioButton pb,bb,ib,ibb;
	JTextField t;
	ButtonGroup group;
	Font pf,bf,itf,ibf;
	
	public GuiJ(){
		super("the title");
		setLayout(new FlowLayout());
		
		t = new JTextField("Hello I am shaikh shahabaj",25);
		add(t);
		
		pb = new JRadioButton("Plain",true);
		bb = new JRadioButton("Bold",false);
		ib = new JRadioButton("italic",false);
		ibb = new JRadioButton("bold and italic",false);
		add(pb);
		add(bb);
		add(ib);
		add(ibb);
		
		pf = new Font("Serif",Font.PLAIN,14);
		bf = new Font("Serif",Font.BOLD,14);
		itf = new Font("Serif",Font.ITALIC,14);
		ibf = new Font("Serif",Font.BOLD + Font.ITALIC,14);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(ibb);
				
		t.setFont(pf);
		
		pb.addItemListener(new MyHandlerClass(pf));
		bb.addItemListener(new MyHandlerClass(bf));
		ib.addItemListener(new MyHandlerClass(itf));
		ibb.addItemListener(new MyHandlerClass(ibf));
	}
	
	private class MyHandlerClass implements ItemListener{
		Font font;
		public MyHandlerClass(Font f){
			font = f;
		}
		public void itemStateChanged(ItemEvent ie){
			t.setFont(font);
		}
	}
}

class JRedioButtons {
	public static void main(String args[]){
		GuiJ s  = new GuiJ();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setVisible(true);
		s.setSize(300,150);
	}
}