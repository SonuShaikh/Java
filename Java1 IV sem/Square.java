// Write a program to input two values and print squate of it
import java.io.*;
class Square
{
	public static void main(String sonu[])
	{
	int a, Square;
	try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value f0r a");
		a=Integer.parseInt(br.readLine());
		Square=a*a;
		System.out.println("The Square=" +Square);
	    }catch(Exception c) {}
    }
}