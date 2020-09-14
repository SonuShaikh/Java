class mat1
{
	int matrix[][]=new int[2][2];
	void getdata(int n[][])
	{
		int i,j;
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
		matrix[i][j]=n[i][j];
		}}
	}
	void print()
	{
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
		     System.out.print(matrix[i][j]);
		    }
			System.out.println();
		}
	}
}
class ArithmeticInh
{
	public static void main(String arg[])
	{
		mat1 obj=new mat1();
	obj.getdata{{1,2} , {3,4}};
	}
}