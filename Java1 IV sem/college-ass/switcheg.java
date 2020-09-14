// program to add, sub,multiple,or divide, two numbers as per user wants
import java.io.*;
class switcheg
{
	public static void main(String sonu[])
	{
		int num1,num2,n;
		try
		{
			BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
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
					int Add=num1+num2;
				System.out.println("ADDITION IS "+Add);
					break;
				}
				case 2:
				{
					int sub=num1-num2;
					System.out.println("SUBTRACTION IS "+sub);
					break;
				}
				case 3:
				{
					int mul=num1*num2;
					System.out.println("MULTIPLICATION IS "+mul);
					break;
				}
				case 4:
				{
					int div=num1/num2;
					System.out.println("DIVISION IS "+div);
					break;
				}
				default :
				System.out.println("ENTER THE VALIDE NUMBER");
			}
		}catch(Exception e){}
	}
	
	
}
/*Enter the two numbers
20
30
Press 1 for the ADDITION
Press 2 for the SUBTRACTION
Press 3 for the MULTIPLICATION
Press 4 for the DIVISION
3
MULTIPLICATION IS 600*/