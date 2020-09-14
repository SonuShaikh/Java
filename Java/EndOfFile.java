import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*;
class EndOfFile{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("myFile.txt");
		BufferedReader br = new BufferedReader(fr);
		int count = 1;
		String str;
		while((str = br.readLine()) != null){
			System.out.println(count+" "+str);
			count++;
		 }
		
	}
}