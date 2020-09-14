// Input the Marks is three subject of three subject and find sum and avarage of marks
import java.io.*;
class Marks
{
	public static void main(String arg[])
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Enter the Marks for three subject, EACH ON THE NEW LINE");
			int m1=Integer.parseInt(br.readLine());
			int m2=Integer.parseInt(br.readLine());
			int m3=Integer.parseInt(br.readLine());
			System.out.println("The sum of the Marks is the : "+(m1+m2+m3));
			double Average=(m1+m2+m3)/3;
			System.out.println("The Average of the Marks in subject is: " +Average );
		}catch(Exception e){System.out.println("Exception Caugth:"+e);}
	}
}