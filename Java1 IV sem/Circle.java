// Write a program to rivee value for the r and find area , diameter, circumference 
import java.io.*;
class Circle
{
	public static void main(String sonu[])
	{
	int r,d,c;
	float Area;
	try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value for r");
		r=Integer.parseInt(br.readLine());
		d=2*r;
		System.out.println("Dimeter =" +d);
		c=2*d*r;
		System.out.println("Circumference="+c);
		Area=d*r*r;
		System.out.println("AREA OF CIRCLE="+Area);
	    }catch(Exception E) {}
    }
}