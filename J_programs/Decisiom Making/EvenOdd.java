// write a progra to input the number and chea it even or odd
import java.io.*;
class EvenOdd
{
	public static void main(String arg[])
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Enter the Any Number You Want");
			int n=Integer.parseInt(br.readLine());
			if(n%2==0)
			{
				System.out.println(n+" Is the Even Number");
			}
			else
			{
				System.out.println(n+" Is the Odd Number");
			}
		}catch(Exception e){System.out.println("Caugth Exception:"+e);}
	}
}