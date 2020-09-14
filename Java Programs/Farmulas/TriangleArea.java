// write program to find area of the tringle using constant values (Formulas : a=1/2bh)
import java.io.*;
class TriangleArea
{
	public static void main(String args[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter The Bredth of Triangle ");
			double B=Double.parseDouble(br.readLine());
			System.out.println("Enter the Hight of Triangle");
			double H= Double.parseDouble(br.readLine());
			double Area= (B*H)*1/2;
			System.out.println("The Area of The Triagle is : "+Area);
			
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
	}
}