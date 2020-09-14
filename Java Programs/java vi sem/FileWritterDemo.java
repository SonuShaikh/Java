//Working with FileWriteDemo
import java.io.*;
class FileWriteDemo{
	public static void main(String[] args)throws IOException{
		String source = "This is the Sample File\n"+
						"This File is Use by the FileWriter \n"+
						"This File is Created by the Java File Writer";
		
		char buff[] = new char[source.length()];
		source.getChars(0,source.length(),buff,0);
		
		FileWriter fw = new FileWriter("MyFile.txt");
		
		for(int i =0; i<buff.length; i++){
			fw.write(buff[i]);
		}
		
		fw.close();
		
		FileWriter fw1 = new FileWriter("Two.txt");
		fw1.write(buff);
		
		FileWriter fw2 = new FileWriter("three.txt");
		fw1.write(buff,buff.length - buff.length,buff.length/4);
		fw2.close();
	}
}