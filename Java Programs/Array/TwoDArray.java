//Two Diamentional Arrys
class TwoDArray
{
	public static void main(String args[])
	{
		int sonu[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Array Matrix  : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(sonu[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}
