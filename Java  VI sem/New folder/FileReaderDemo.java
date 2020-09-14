// Working with FileReaderClass 
import java.io.*;
class FileReaderDemo{
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("MyData.txt");
		BufferedReader br = new BufferedReader(fr);
		String s ;
		while((s=br.readLine())!= null){
			System.out.println(s);
		}
		fr.close();
	}
}
/*
Output : 
Name : shaikh Shahabaj.
RollNo : 95
Division : A
Last Year Percentage : 79.43

*/