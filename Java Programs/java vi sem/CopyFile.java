// Write a program to make copy of a file Byte wise
import java.io.*;
class CopyFile{
	public static void main(String[] args)throws IOException{
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream("new.txt");
		
		byte b ;
		while((b =fis.read()) != -1){
			fos.write(b);
		}
		fis.close();
		fos.close();
	}
}