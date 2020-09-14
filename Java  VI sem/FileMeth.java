//Demonstrate File Methods
import java.io.*;
class FileMeth{
	private static void p(String s){
		System.out.println(s);
	}
	public static void main(String[] args){
		File f1 = new File("C:\\Users\\sonu\\Documents\\Java Programs\\Java.io\\FileMeth.java");
		p("File Name "+f1.getName());
		p("Path "+f1.getPath());
		p("Absolute Path "+ f1.getAbsolutePath());
		p("Parent "+f1.getParent());
		p(f1.exists() ? " is Exist" : " Is Not Exist");
		p(f1.canWrite() ? " Is Writeble" : " Is Not Writeble");
		p(f1.canRead() ? " is Readble " : " is Readble");
		p(f1.isFile() ? " is normal File" : "is Directory");
		p("File Last Modification Date : "+f1.lastModified());
		p("File Size "+f1.length()+ "Bytes");
	}
}

/*
File Name FileMeth.java
Path C:\Users\sonu\Documents\Java Programs\Java.io\FileMeth.java
Absolute Path C:\Users\sonu\Documents\Java Programs\Java.io\FileMeth.java
Parent C:\Users\sonu\Documents\Java Programs\Java.io
 is Exist
 Is Writeble
 is Readble
 is normal File
File Last Modification Date : 1471751334521
File Size 725Bytes
*/