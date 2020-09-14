// Write a program to swap two number withought usint third veriable
import java.io.*;
class Swap
{
	public static void main(String sonu[])
	{
	int a, b,t;
	try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value f0r a");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter the value f0r b");
		b=Integer.parseInt(br.readLine());
		t=a;
		a=b;
		b=t;
		System.out.println("After the swaping");
		System.out.println(" value f0r a\n" +a);
		System.out.println("value f0r b\n" +b);
	    }catch(Exception c) {}
    }
}