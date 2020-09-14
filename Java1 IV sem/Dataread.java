import java.io.*;
class Dataread 
{
	public static void main(String sonu[])
	{
		int a;
		float b;
		String s1, s2,s3;
                try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter an integer number:");
		s1= br.readLine ();
		a=Integer.parseInt(s1);
		System.out.println("Value of a="+a);
		System.out.println("Enter the float number:");
		s2= br.readLine ();
		b=Float.parseFloat(s2);
		System.out.println("Value of b="+b);
                s3=s1+s2;
                System.out.println("Addtion of two number is"+s3); 
            }catch(Exception e)
{}
	}
}