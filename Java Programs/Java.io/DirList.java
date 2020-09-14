 // Demonstrate the Directory or File
import java.io.*;
class DirList{
	public static void main(String[] args){
		String dirname = "C:\\Users\\sonu\\Documents\\Java Programs";
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
			System.out.println(dirname+" Is Not A Directory");
		}
	}
}  
