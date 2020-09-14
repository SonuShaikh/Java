import java.util.*;
import java.io.*;
class AvgNumbFile{
	public static void main(String arg[])throws IOException{
		int count = 0;
		double sum = 0.0;
		//output to the File
		FileWriter fi = new FileWriter("Test.txt");
		fi.write("123.4, 56.7, 10.8, 20 99.9, 140 Done");
		fi.close();
		FileReader fr = new FileReader("Test.txt");
		Scanner scan = new Scanner(fr);
		scan.useDelimiter(", ");
		while(scan.hasNext()){
			if(scan.hasNextDouble()){
				sum +=scan.nextDouble();
				count++;
			}else{
				String str =scan.next().toLowerCase();
				if(str.equals("Done")){
					break;
				}
				else{
					System.out.println("Data Format Erro");
				}
			}
		}
		System.out.println("Average Is :"+sum/count);
	}
}