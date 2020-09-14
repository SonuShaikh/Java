// Demonstrate useof the CRADLAYOUT
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CardLayoutDemo extends Applet implements ActionListener,MouseListener{
	String smg = "";
	Checkbox imac,iphone,itune,ipod,ipad;
	Checkbox winXp,win7,win8,win8_1,win10;
	CardLayout CardLO;
	Panel SoftComp;
	Button MicroSoft,Apple;
    public void init(){
		// Applet Product Checkbox
		imac = new Checkbox("IMac",null,true);
		iphone = new Checkbox("Iphone");
		itune = new Checkbox("Itune");
		ipod = new Checkbox("ipod");
		ipad = new Checkbox("ipad");
		
		//Mocrosoft Product Checkbox
		winXp = new Checkbox("Windows XP",null,true);
		win7 = new Checkbox("Windows 7");
		win8 = new Checkbox("Windows 7");
		win8_1 = new Checkbox("Windows 8_1");
		win10 = new Checkbox("Windows 10");
		
		CardLO = new CardLayout();
		SoftComp = new Panel();
		SoftComp.setLayout(CardLO);
		
		MicroSoft = new Button("Microsoft");
		Apple  = new Button("Apple");
		
		add(Apple);
		add(MicroSoft);
		
		Apple.addMouseListener(this);
		MicroSoft.addMouseListener(this);		
		
		// add appet product to panel
		Panel ApplePan = new Panel();
		ApplePan.add(imac);
		ApplePan.add(iphone);
		ApplePan.add(itune);
		ApplePan.add(ipod);
		ApplePan.add(ipad);
		
		// add Microsoft Product to panles
		Panel MicrosoftPan = new Panel();
		MicrosoftPan.add(winXp);
		MicrosoftPan.add(win7);
		MicrosoftPan.add(win8);
		MicrosoftPan.add(win8_1);
		MicrosoftPan.add(win10);
		
		SoftComp.add(ApplePan,"Appel");
		SoftComp.add(MicrosoftPan,"MIcrosoft");
		
		add(SoftComp);
		
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	
	// Handle MouseEvent
	public void mouseClicked(MouseEvent me){
		
	}
	public void mousePressed(MouseEvent me){
		CardLO.next(SoftComp);
	}
	public void mouseReleased(MouseEvent me){
		
	}
	public void mouseEntered(MouseEvent me){
		
	}
	public void mouseExited(MouseEvent me){
		
	}
	//Action Event
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == MicroSoft){
			CardLO.show(SoftComp,"Microsoft");
		}
		else{
			CardLO.show(SoftComp,"Apple");
		}
	}
}