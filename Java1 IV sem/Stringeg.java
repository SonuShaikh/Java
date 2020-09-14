import java.io.*;

class Stringeg
{
	public static void main(String sonu[])
	{
 String s=new String();
 try
 {
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the your name ");
	 s=br.readLine();
	 System.out.println("Your name is ="+s);
 } catch(Exception e){}
}
}