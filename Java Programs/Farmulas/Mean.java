// Write program to calculate the mean of the numbers 
import java.util.Scanner;
class Mean
{
	public static void main(String arg[])
	{
		Scanner scan= new Scanner(System.in);
		try{
		int sum=0, num;
		System.out.println("Enter the How Many Number You Want to Find out mean : ");
		num=scan.nextInt();
		System.out.println("Enter the Any "+num+ " Numbers");
		for(int i=1; i<=num; i++)
		{
			int inputNum = scan.nextInt();
			sum=sum+inputNum;
			System.out.println(" Sum : "+sum);
		}
		System.out.println("The mean of the numbers You've Entered Is : "+(sum/num));
		
		}catch(Exception e)
		{
			System.out.println("Exception Caught : "+e);
		}
		}
}