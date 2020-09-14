// Demonstrate FileDialog
import java.awt.*;
import java.awt.event.*;
class SampleFrame2 extends Frame{
	SampleFrame2(String title){
		super(title);
		//Remove window whene	 closed
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}
class FileDialogBox {
	public static void main(String args[]){
		Frame f = new SampleFrame2("FileDialogDemo");
		f.setVisible(true);
		f.setSize(100,100);
		FileDialog fd = new FileDialog(f,"FileDialog",FileDialog.SAVE);
		fd.setVisible(true);
	}
}