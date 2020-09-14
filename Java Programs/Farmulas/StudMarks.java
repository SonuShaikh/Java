// write program to input marks in three subject and find sum and average marks
import java.io.*;
class StudMarks
{
	public static void main(String arg[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			
		
		{
			System.out.println("Enter The Marks in Three Subject : (Each in New Line)");
			int m1=Integer.parseInt(br.readLine());
			int m2=Integer.parseInt(br.readLine());
			int m3=Integer.parseInt(br.readLine());
			System.out.println("The Marks in Frist Subject : "+m1);
			System.out.println("The Marks in Second Subject : "+m2);
			System.out.println("The Marks in Third Subject : "+m3);
			
			System.out.println("The Sum of Three Marks is : "+(m1+m2+m3));
			double Avg= ((m1+m2+m3)/3);
			System.out.println("The Avarage of Three Marks is : "+Avg);
			
			
			
		}
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}