//// Write program to Recivie to values form commmand line and Swap the using Thrid veriable
import java.io.*;
class Swap
{
	public static void main(String arg[])
	{
		try{
			
			BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Enter the number first");
			int nu1=Integer.parseInt(br.readLine());
			System.out.println("Enter the number second");
			int nu2=Integer.parseInt(br.readLine());
			System.out.println("The first number is the:"+nu1);
			System.out.println("The second number is the:"+nu2);
			int t=nu1;
			nu1=nu2;
			nu2=t;
			System.out.println("After the Swap Numbers are");
			
			System.out.println("The SQUATE  of FIRST NUMBER  "+nu1);
			System.out.println("The SQUATE  of SECOND NUMBER  "+nu2);
		}catch(Exception e){System.out.println("Exception Caugth:"+e);}
	}
}