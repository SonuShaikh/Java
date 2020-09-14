// Write program to Recivie to values form commmand line and display sum of them
import java.io.*;
class sum
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
			System.out.println("The sum of  "+nu1+" And "+nu2+ " is Equal to the :\n"+(nu1+nu2));
		}catch(Exception e){System.out.println("Exception Caugth:"+e);}
	}
}