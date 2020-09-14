// Switch example
import java.io.*;
class Switcheg
{
	public static void main(String sonu[])
         {
	int n;
	try
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Value for N");
		n= Integer.parseInt(br.readLine());
		switch(n)
		{
			case 1:
			System.out.println("Aurangabad");
			break;
			case 2:
			System.out.println("Bumbai");
			break;
			case 3:
			System.out.println("Channai");
			break;
			case 4:
			System.out.println("Dehli");
                        break;
			default:
			System.out.println("Please Enter the 'valid Key");
                        break;
		}
		System.out.println("HAPPY JOURNEY");
	} catch(Exception e){}
}
}