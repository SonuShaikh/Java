//// Write program to Recivie to values form commmand line and display Square  of them
import java.io.*;
class Square
{
	public static void main(String arg[])
	{
		try{
			
			BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Enter the number first");
			int nu1=Integer.parseInt(br.readLine());
			System.out.println("Enter the number second");
			int nu2=Integer.parseInt(br.readLine());
			System.out.println("The first number is the:\n"+nu1);
			System.out.println("The second number is the: \n"+nu2);
			System.out.println("The SQUATE  of FIRST NUMBER  "+(nu1*nu1));
			System.out.println("The SQUATE  of SECOND NUMBER  "+(nu2*nu2));
		}catch(Exception e){System.out.println("Exception Caugth:"+e);}
	}
}