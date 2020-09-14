// Using InputStream byte wise Dat File Handling
import java.io.*;
class WriteByte{
	public static void main(String[] args)throws IOException{
		byte cities[]= {'A','U','R','N','G','A','B','A','D',' ',
						'P','U','N','E',' ',
						'M','U','M','B','A','I'
					    };
	
		FileOutputStream outfile = new FileOutputStream("Cities.txt");
		outfile.write(cities);
		outfile.close();
	}
}