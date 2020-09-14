import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Frames extends Frame{
         Frames(String title){
			 super(title);
			 MyWindowAd adpt = new MyWindowAd(this);
			 addWinnowListener(adpt);
		 }	
}