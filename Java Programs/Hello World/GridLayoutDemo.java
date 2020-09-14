// Demonstrate use o fthe GridLayout
import java.awt.*;
import java.applet.*;
public class GridLayoutDemo extends Applet{
      final int n = 4;
	  public void init(){
		  setLayout(new GridLayout(n,n));
		  setBackground(Color.cyan);
		  for(int i = 0 ; i<n; i++){
			  for(int j = 0 ; j< n ;j++){
				  int k = i*n+j;
				  if(k>0){
					  add(new Button(""+k));
				  }
			  }
		  }
	  }
}
