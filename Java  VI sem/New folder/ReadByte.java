// FileHandling byte wise reading from file By using FileInputStream
import java.io.*;
class ReadByte{
	public static void main(String[] args)throws IOException{
		File f = new File("Cities.txt");
		FileInputStream fis = new FileInputStream(f);
		
                byte b ;
		while((b =(byte)fis.read()) != -1){
			fis.read();
		}
		System.out.println(fis);
		fis.close();
	}
}