// program to add, sub,multiple,or divide, two numbers as per user wants
import java.io.*;
class switcheg
{
	public static void main(String sonu[])
	{
		int num1,num2,n;
		try
		{
			BufferedReader br=BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter the two numbers");
			num1=Integer.parseInt(br.readLine());
			num2=Integer.parseInt(br.readLine());
			System.out.println("Press 1 for the ADDITION");
			System.out.println("Press 2 for the SUBTRACTION");
			System.out.println("Press 3 for the MULTIPLICATION");
			System.out.println("Press 4 for the DIVISION");
			n=Integer.parseInt(br.readLine());
			switch(n)
			{
				case 1:
				{
					int Addition=num1+num2;
					return addition;
					break;
				}
				case 2:
				{
					int subtraction=num1-num2;
					return subtraction;
					break;
				}
				case 3:
				{
					int multiplecation=num1*num2;
					return multiplecation;
					break;
				}
				case 4:
				{
					int division=num1/num2;
					return division;
					break;
				}
				
			}
		}catch(Exception e){}
	}
	
	
}