// Demonstrate File Reading
import java.io.*;
import java.util.*;
class FileReading{
	private Scanner x;
	
	public void openFile(){
		try{
			x = new Scanner(new File("Sonu.txt"));
		}catch(Exception e){
			System.out.println("You Got An Error");
		}
	}
	
	public void readFile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s \n",a,b,c);
		}
	}
	public void closeFile(){
		x.close();
	}
}
class FileDemo2{
	public static void main(String[] arg){
		FileReading r = new FileReading();
		r.openFile();
		r.readFile();
		r.closeFile();
	}
}