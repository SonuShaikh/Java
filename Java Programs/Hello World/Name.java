// write program in java to print your name, Rollno, Contact NO. and whatever YOu want
import java.io.*;
class Name
{
	public static void main(String sonu[])
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter Your First Name : ");
			String Name=br.readLine();
			 System.out.println("Enter YOur Roll NO : ");
			int rollno=Integer.parseInt(br.readLine());
			System.out.println("Enter your Contact No : ");
			int contno=Integer.parseInt(br.readLine()); 
			
			
			System.out.println("Hello "+Name);
			System.out.println("Your RollNo is  "+rollno);
			System.out.println("And Your Contact NO is  "+contno); 
			
			
		}catch(Exception e){}
	}
}