// Create Application window
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class AppWindow extends Frame{
	String keySmg = "This is the Test";
	String mouseSmg = "";
	int mouseX = 30, mouseY = 30;
	public AppWindow(){
		addMouseListener(new MyMouseAdapterApps(this));
		addKeyListener(new MyKeyAdapterApps(this));
		addWindowListener(new MyWindowAdapterApps());

	}
	public void paint(Graphics g){
		g.drawString(keySmg,20,30);
		g.drawString(mouseSmg,mouseX,mouseY);
	}
	// Create a Window
	public static void main(String[] args){
		AppWindow appwindow = new AppWindow();
		appwindow.setSize(new Dimension(300,200));
		appwindow.setTitle("The Awt base Application");
		appwindow.setVisible(true);
	}
}
class MyMouseAdapterApps extends MouseAdapter{
	AppWindow appwindow;
	public MyMouseAdapterApps(AppWindow appwindow){
		this.appwindow = appwindow;
	}
	public void mousePressed(MouseEvent me){
		appwindow.mouseX = me.getX();
		appwindow.mouseY = me.getY();
		appwindow.mouseSmg = "Mouse Down at "+appwindow.mouseX+","+appwindow.mouseY;
		appwindow.repaint();
	}
	
}

class MyKeyAdapterApps extends KeyAdapter{
	AppWindow appwindow;
	public MyKeyAdapterApps(AppWindow appwindow){
		this.appwindow = appwindow;
	}
	public void keyTyped(KeyEvent ke){
		appwindow.keySmg += ke.getKeyChar();
		appwindow.repaint();
	}
}
class MyWindowAdapterApps extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}