// File Write Demo
import java.io.*;
class FileWriteDemo{
	public static void main(String[] args)throws IOException{
	      String source = "This is to be sample File \n"+
		                  "This File is Use By FileWriter \n"+
						  "This File is Created by Java";
		  char buffer[] = new char[source.length()];
		  source.getChars(0,source.length(),buffer,0);
		  FileWriter fw1 = new FileWriter("one.txt");
		  
		  for(int i = 0; i<buffer.length; i++)
			  fw1.write(buffer[i]);
			  fw1.close();
			  
		  FileWriter fw2 = new FileWriter("Two.txt");
		   fw2.write(buffer);
		   fw2.close();
		   
		    FileWriter fw3 = new FileWriter("Three.txt");
		   fw3.write(buffer,buffer.length-buffer.length/4,buffer.length/4); 
		   fw3.close();

	}
}
/*
Output : 
 One.txt   
This is to be sample File 
This File is Use By FileWriter 
This File is Created by Java
Two.txt
This is to be sample File 
This File is Use By FileWriter 
This File is Created by Java
Three.txt
le is Created by Java
*/
