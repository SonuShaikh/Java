// Write a Program to find largest of 10 numbers
import java.util.*;
class Large10
{
	public static void main(String args[])
	{
		int num[]= new int[9];
		int larg= num[0];
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the 10 Numbers");
		for(int i=0; i<9; i++)
		{
			num[i]=Scan.nextInt();
		}
		for(int i=0; i<9; i++)
		{
			if(num[i]<num[i+1])
			{
				larg= num[i+1];
			}
			
		}
		System.out.println(larg);
	}
}