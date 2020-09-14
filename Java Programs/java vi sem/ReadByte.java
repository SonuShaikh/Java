// FileHandling bytewise reading from file By using FileInputStream
import java.io.*;
class ReadByte{
	public static void main(String[] args)throws IOException{
		File f = new File("Cities.txt");
		FileInputStream fis = new FileInputStream(f);
		fis.read();
		System.out.println(fis);
		fis.close();
	}
}