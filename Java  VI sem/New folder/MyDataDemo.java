
// Write a program to accept your name, Rollno , Division and Last year Persentage Store this to the file
import java.io.*;
class MyDataDemo{
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		do{
		try{
			System.out.println("Enter Your Name :");
			String Name = br.readLine();
			
			System.out.println("Enter Your RollNO :");
			int rollNo = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Your Division : ");
			String div = br.readLine();
			
			System.out.println("Enter Your Last Years Percentage : ");
			double per = Double.parseDouble(br.readLine());
			
			String source = "Name : "+Name+ ".\n"+
							"RollNo : "+rollNo+"\n"+
							"Division : "+div+"\n"+
							"Last Year Percentage : "+per;
			System.out.println(source);
			char buff[] = new char[source.length()];
			source.getChars(0,source.length(),buff,0);
			FileWriter fr = new FileWriter("MyData.txt");
			for(int i=0; i<source.length(); i++)
				fr.write(buff[i]);
			
			fr.close();
			x = 2;
				
		}catch(NumberFormatException e){
			System.out.println("You Can't Enter The String or charactor as Numeric Data");
		}
		}while(x == 1);
	} 
}