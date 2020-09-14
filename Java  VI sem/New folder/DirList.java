 // Demonstrate the Directory or File
import java.io.*;
class DirList{
	public static void main(String[] args){
		String dirname = "C:\\Users\\sonu\\Desktop";
		File f1  = new File(dirname);
		if(f1.isDirectory()){
			System.out.println("Directory of "+dirname);
			String[] s = f1.list();
			for(int i = 0 ; i < s.length; i++){
				File f = new File(dirname+ "/"+s[i]);
				if(f.isDirectory()){
					System.out.println(s[i]+" is a Directory");
				}else{
					System.out.println(s[i]+" is a Not Directory");
				}
			}
		}else{
			System.out.println(dirname+" Is a File");
		}
	}
}  
/*
Output:
Directory of C:\Users\sonu\Desktop
desktop.ini is a Not Directory
Internet Download Accelerator.lnk is a Not Directory
Java is a Directory
JavaTheCompleteReference.pdf is a Not Directory
oracle-database-11g-the-complete-reference.pdf is a Not Directory
*/