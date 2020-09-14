// Demonstrat the File Filter Directoried
import java.io.*;
class OnlyExt implements FilenameFilter{
	String ext;
	public  OnlyExt(String ext){
		this.ext = "."+ext;
	}
	 public boolean accept (File d, String n){
		return n.endsWith(ext);
	}
}

class FileFiltered{
	public static void main(String[] arg)throws IOException{
		String directoryName = "C:\\Users\\sonu\\Documents\\Java Programs\\java vi sem";
		File f1 = new File(directoryName);
		FilenameFilter filt = new OnlyExt("java");
		String s[] = f1.list(filt);
		
		for(int i =0; i<s.length; i++){
			System.out.printf("%s \n",s[i]);
		}
	}
}