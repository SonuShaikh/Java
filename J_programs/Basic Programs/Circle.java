// Accept the value of radius and display the diameter , circumfern and Area of the Cirle
import java.io.*;
class circle
{
	public static void main(String arg[])
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the value for Redus of Circle");
			int r=Integer.parseInt(br.readLine());
			int d=2*r;
	        System.out.println();
			
            System.out.println("The DiaMeter of the Given Circle is the:"+d);
            System.out.println();			
            System.out.println("The Circumference of the Given Circle is the:"+(2*d*r));
            System.out.println();			
            System.out.println("The Area  of the Given Circle is the:"+(2*3.14*r));			
     		}catch(Exception e){System.out.println("Exception Caugth:"+e);}
	}
}