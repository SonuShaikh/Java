// Denonstrate use of teh CardLayout
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CardLayoutDemo2 extends Applet implements MouseListener,ActionListener{
	Panel osCards;
	Checkbox winXpCb, winVistaCb, solariesCb, macCb;
	CardLayout  CardLo;
	Button WinBtn, OtherBtn;
	
	public void init(){
		//Button
		WinBtn = new Button("Windows");
		OtherBtn = new Button("Other");
		
		add(WinBtn);
		add(OtherBtn);
		CardLo = new CardLayout();
		osCards = new Panel();
		//Set panel layout ot cardlayout
		osCards.setLayout(CardLo);
		
		// Checkbox
		winXpCb = new Checkbox("Windows Xp",null,true);
		winVistaCb = new Checkbox("Windows Vista");
		solariesCb = new Checkbox("Solaries");
		macCb = new Checkbox("Mac Os");
		
		// add windows check boxes to panel
		Panel  winPan = new Panel();
		winPan.add(winXpCb);
		winPan.add(winVistaCb);
		
		// add other Os check box to panel
		Panel otherPan = new Panel();
		otherPan.add(solariesCb);
		otherPan.add(macCb);
		
		// add panel to deck panel
		osCards.add(winPan,"Windows");
		osCards.add(otherPan, "Others");
		
		// add Card to main Applet
		add(osCards);
		
		//Registere to receive Action events
		WinBtn.addActionListener(this);
		OtherBtn.addActionListener(this);
		
		// register mouseEvents
		addMouseListener(this);
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
	}
	// Cycle to panel
	public void mousePressed(MouseEvent me){
		CardLo.next(osCards);
	}
	//Provide empty implementation to other mouse Events
	public void mouseReleased(MouseEvent me){
		
	}
	public void mouseClicked(MouseEvent me){
		
	}
	public void mouseEntered(MouseEvent me){
		
	}
	public void mouseExited(MouseEvent me){
		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == WinBtn){
			CardLo.show(osCards,"Windows");
		}
		else{
			CardLo.show(osCards,"Others");
		}
	}
}