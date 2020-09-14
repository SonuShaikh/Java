//Demonstrate Use of the FilenameFilter
import java.io.*;
class DirListOnly{
	public static void main(String args[]){
	      String dirname = "C:\\Users\\sonu\\Documents\\Java Programs";
		  File f1 = new File(dirname);
		  FilenameFilter only = new onlyExt("java");
		  String[] s = f1.list(only);
		  
		  for(int i = 0; i<s.length; i++){
			  System.out.println(s[i]);
		  }
     }
}

class onlyExt implements FilenameFilter{
	String ext;
		  public onlyExt(String ext){
			  this.ext = "."+ext;
		  }
		 public  boolean accept(File dir, String Name){
			 return Name.endsWith(ext);
		 }
}


