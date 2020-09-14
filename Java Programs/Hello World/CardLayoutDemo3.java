// Demonstrate user of the CardLayout
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CardLayoutDemo3 extends Applet implements MouseListener, ActionListener{
	Checkbox Sonu,Anita,Dapke,Shaikh;
	CardLayout CardLo;
	Panel nameCard;
	Button SonuBtn, AnitaBtn;
	
	public void init(){
		SonuBtn = new Button("Sonu");
		AnitaBtn = new Button("Sony");
		add(SonuBtn);
		add(AnitaBtn);
		
		nameCard = new Panel();
		CardLo = new CardLayout();
		nameCard.setLayout(CardLo);
		
		Sonu = new Checkbox("Shahabaj");
		Shaikh = new Checkbox("Shaikh");		
		Anita= new Checkbox("Antia");
		Dapke = new Checkbox("Dapke");
		
		Panel SonuPan = new Panel();
		SonuPan.add(Sonu);
		SonuPan.add(Shaikh);
		
		Panel AnitaPan = new Panel();
		AnitaPan.add(Anita);
		AnitaPan.add(Dapke);
		
		nameCard.add(AnitaPan,"Anita");
		nameCard.add(SonuPan,"Sonu");
		add(nameCard);
		
		
		AnitaBtn.addActionListener(this);
		SonuBtn.addActionListener(this);
		
		// register mouseEvents
		addMouseListener(this);
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	
	// Cycle to panel
	public void mousePressed(MouseEvent me){
		CardLo.next(nameCard);
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
		if(ae.getSource() == SonuBtn){
			CardLo.show(nameCard,"Sonu");
		}
		else{
			CardLo.show(nameCard,"Anita");
		}
	}
}