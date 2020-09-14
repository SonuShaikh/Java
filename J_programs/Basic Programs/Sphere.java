// Accept the value of radius and display the diameter , Calculate the Valuam of the Sphere Area=4dr^2, valuam=4/3dr^3
import java.io.*;
class Sphere
{
	public static void main(String arg[])
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the value for Redus of Circle");
			int r=Integer.parseInt(br.readLine());
			int d=2*r;
	        System.out.println();
		    double Area=4*d*r*r;// Area of the Sphere
			System.out.println("The Area of The Sphere is:"+Area);
			double Valuam=4/3*d*r*r*r;// Valuam of the Sphere
			System.out.println("The Valuem of the Sphere is:"+Valuam);
			
			
            	
     		}catch(Exception e){System.out.println("Exception Caugth:"+e);}
	}
}