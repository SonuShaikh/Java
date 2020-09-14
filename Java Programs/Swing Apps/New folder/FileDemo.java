// File Class
import java.io.*;
import java.util.*;
class CreatFile{
	private Formatter x;
	public void openFile(){
		try {
			x = new Formatter("Sonu.txt");
		}catch (Exception e){
			System.out.println("You Got An Error");
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s","20", " Sonu", " Shaikh");
	}
	
	public void fileClose(){
		x.close();
	}
}
class FileDemo{
	public static void main(String[] args){
		
		CreatFile f = new CreatFile();
		f.openFile();
		f.addRecords();
		f.fileClose();
		
		/* File x = new File("C:\\Users\\sonu\\Documents\\Java Programs\\DataFile.txt");
		
		if(x.exists())
			System.out.println(x.getName()+" File Exist");
		else
			System.out.println("Sorry File Not Exist"); */
		
		/* final Formatter x;
		try{
			x = new Formatter("Sonu.txt");
			System.out.println("You have Create File successfuly");
		}catch(Exception e){
			System.out.println("You got an Error");
		} */
	}
}