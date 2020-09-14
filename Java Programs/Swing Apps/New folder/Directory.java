// Check Giving file is  directory or file
import java.io.*;
class Directory{
	public static void main(String[] args)throws IOException{
		String dirName = "C:\\Users\\sonu\\Documents\\Java Programs\\Applets";
		File f = new File(dirName);
		if(f.isDirectory()){
			System.out.println("Dirctory of "+dirName);
			String[] s = f.list();
			for(int i =0; i<s.length; i++){
				File f1 = new File(dirName+ ","+s[i]);
				if(f1.isDirectory()){
					System.out.println(s[i]+ " Is a Directory");
				}else{
					System.out.println(s[i] +" Is a File");
				}
			}
		}else{
			System.out.println(dirName+ " Is not Directiory");
		}
	}
}