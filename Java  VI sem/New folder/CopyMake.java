// Write a program to make copy of a file Byte wise
import java.io.*;
class CopyMake{
	public static void main(String[] args)throws IOException{
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream("CopyFile.txt");
		
		byte b ;
		while((b =(byte)fis.read()) != -1){
			fos.write(b);
		}
		fis.close();
		fos.close();
	}
}
/*
output:
CopyFile.txt
AURNGABAD PUNE MUMBAI
*/