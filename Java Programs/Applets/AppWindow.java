//
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class AppWindow extends Frame
{
	String keysmg = "This is a test";
	String mousesmg = "";
	int mouseX = 30;
	int mouseY = 30;
	public AppWindow()
	{
		addKeyListener(new MyKeyAdapter(this));
		addMouseListener(new MyMousesAdapter(this));
		addWindowListener(new MyWindowsAdaper());
	}
	public void paint(Graphics g)
	{
		g.drawString(keysmg,10,20);
		g.drawString(mousesmg,mouseX,mouseY);
	}
	
	// create a window
	public static void main(String agrs[])
	{
		AppWindow appwin= new AppWindow();
		appwin.setSize(new Dimension(250,250));
		appwin.setTitle("An awt base Application");
		appwin.setVisible(true);
	}
}
class MyKeyAdapter extends KeyAdapter
{
	AppWindow appwindo;
	public MyKeyAdapter(AppWindow appwindo)
	{
		this.appwindo = appwindo;
	}
	public void keyPressed(KeyEvent ke)
	{
		appwindo.keysmg += ke.getKeyChar();
		appwindo.repaint();
	}
}
class MyMousesAdapter extends MouseAdapter
{
	AppWindow ap;
	public MyMousesAdapter(AppWindow ap)
	{
		this.ap = ap;
		
	}
	public void mousePressed(MouseEvent me)
	{
		ap.mouseX = me.getX();
		ap.mouseY = me.getY();
		ap.mousesmg = "Mouse down at"+ap.mouseX+ ","+ap.mouseY;
		ap.repaint();
	}
}
class MyWindowsAdaper extends WindowAdapter 
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}