// Demonstrate Methods for Fileclass
import java.io.*;
class FileDemo{
	static void print(String s){
		System.out.printf("%s \n",s);
	}
	public static void main(String[] arg)throws IOException{
		File f1 = new File("MyData.txt");
		
		print("File Name : "+f1.getName());
		print("Path : "+f1.getPath());
		//print("Abs Path : "+f1.absolutePath());
		print("ParentNode : "+f1.getParent());
		//print(f1.exist() ? " Exist" : " Does Not Exist");
		print(f1.canWrite() ? "Writable" : "Does Not Write ");
		print(f1.canRead() ? "Readeble" : "Does Not Readble");
		print(f1.isFile() ? "is a File" : "is not File");
		print(f1.isDirectory() ? "is Directory" : "is not Directory");
		print("File Last Modified : "+f1.lastModified());
		print("FileSize : "+f1.length()+ " Byte");
	}
}
/*
OUTPUT:
C:\Users\sonu\Documents\Java Programs\java vi sem>javac FileDemo.java

C:\Users\sonu\Documents\Java Programs\java vi sem>java FileDemo
File Name : MyData.txt
Path : MyData.txt
ParentNode : null
Writable
Readeble
is a File
is not Directory
File Last Modified : 1470223239523
FileSize : 89 Byte*/